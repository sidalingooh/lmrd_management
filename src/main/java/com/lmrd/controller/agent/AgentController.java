package com.lmrd.controller.agent;

import com.lmrd.entity.agent.LmAgent;
import com.lmrd.entity.agent.LmAgentExample;
import com.lmrd.entity.base.PageData;
import com.lmrd.entity.user.BackUser;
import com.lmrd.service.agent.AgentService;
import com.lmrd.util.PageUtil;
import com.lmrd.util.tag.PageTag;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: LiuSiGuang
 * @Date: 2018/11/6 15:02
 * @Description:
 */
@Controller
@RequestMapping("agent")
public class AgentController {


    @Autowired
    private AgentService agentService;

    @RequestMapping(value = "/list")
    public String list(ModelMap map, HttpServletRequest request, Integer pageNo,Integer pageSize,String provinceId,String cityId,String districtId,Long industryTypeId, Long industryTypeTwoId) {
        BackUser backUser = (BackUser) request.getSession().getAttribute("loginUser");
        if (pageNo == null || pageNo.equals("")) {
            pageNo = 1;
        }
        if (pageSize == null || pageSize.equals("")) {
            pageSize = 10;
        }
        PageUtil.startPage(pageNo, pageSize);
        List<LmAgent> agentList = new ArrayList<LmAgent>();
        if(backUser.getUserType().equals(3)) {
            LmAgent agent = new LmAgent();
            agent.setAgentId(backUser.getAgentId());
            agent.setProvinceId(provinceId);
            agent.setCityId(cityId);
            agent.setDistrictId(districtId);
            agent.setIndustryTypeId(industryTypeId);
            agent.setIndustryTypeTwoId(industryTypeTwoId);
            agentList = agentService.selectChildrenList(agent);
        } else {
            LmAgentExample example = new LmAgentExample();
            example.createCriteria().andIsDeleteNotEqualTo(1);
            if(null != industryTypeId && !"".equals(industryTypeId)) {
                example.createCriteria().andIndustryTypeIdEqualTo(industryTypeId);
            }
            if(null != industryTypeTwoId && !"".equals(industryTypeTwoId)) {
                example.createCriteria().andIndustryTypeTwoIdEqualTo(industryTypeTwoId);
            }
            if(StringUtils.isNotBlank(provinceId)) {
                example.createCriteria().andProvinceIdEqualTo(provinceId);
            }
            if(StringUtils.isNotBlank(cityId)) {
                example.createCriteria().andCityIdEqualTo(cityId);
            }
            if(StringUtils.isNotBlank(districtId)) {
                example.createCriteria().andDistrictIdEqualTo(districtId);
            }
            agentList = agentService.selectByExample(example);
        }
        PageData pd = new PageData(agentList);
        PageTag<PageData> pt = new PageTag<PageData>(pd);
        request.setAttribute("pt", pt);
        return "agent/list";
    }

}
