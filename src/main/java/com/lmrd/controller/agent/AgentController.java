package com.lmrd.controller.agent;

import com.lmrd.entity.agent.LmAgent;
import com.lmrd.entity.agent.LmAgentExample;
import com.lmrd.entity.base.PageData;
import com.lmrd.entity.user.BackUser;
import com.lmrd.service.agent.AgentService;
import com.lmrd.util.DateUtils;
import com.lmrd.util.PageUtil;
import com.lmrd.util.tag.PageTag;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String list(ModelMap map, HttpServletRequest request, Integer pageNo,Integer pageSize,String agentName,String provinceId,String cityId,String districtId,Long industryTypeId, Long industryTypeTwoId) {
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
            agent.setAgentName(agentName);
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
            if(StringUtils.isNotBlank(agentName)) {
                example.createCriteria().andAgentNameEqualTo(agentName);
            }
            agentList = agentService.selectByExample(example);
        }
        PageData pd = new PageData(agentList);
        PageTag<PageData> pt = new PageTag<PageData>(pd);
        request.setAttribute("pt", pt);
        return "agent/list";
    }


    @RequestMapping(value = "/entry")
    public String entry(ModelMap map) {

        return "agent/entry";
    }


    @RequestMapping(value = "saveAgent")
    @ResponseBody
    public String saveAgent(HttpServletRequest request,LmAgent agent,String operateEndStr) {
        agent.setIsDelete(0);
        agent.setCreateTime(System.currentTimeMillis());
        agent.setUpdateTime(System.currentTimeMillis());
        agent.setState(0);
        if(StringUtils.isNotBlank(operateEndStr)) {
            try{
                agent.setOperateEnd(DateUtils.getTimeByformatyyyyMMdd(operateEndStr));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(agent.getLevel().equals(1)) {
            agent.setParentId(0L);
        }

        int flag = agentService.insert(agent);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }

    @RequestMapping(value = "getAgentByParentId")
    @ResponseBody
    public List<LmAgent> getAgentByParentId(HttpServletRequest request,LmAgent agent,Long parentId,Long agentId) {
        LmAgentExample example = new LmAgentExample();
        example.createCriteria().andIsDeleteNotEqualTo(1).andParentIdEqualTo(agentId);
        List<LmAgent> list = agentService.selectByExample(example);

        return list;
    }

    @RequestMapping(value = "getAllAgentByParentId0")
    @ResponseBody
    public List<LmAgent> getAllAgentByParentId0(HttpServletRequest request,LmAgent agent,Long parentId,Long agentId) {
        LmAgentExample example = new LmAgentExample();
        example.createCriteria().andIsDeleteNotEqualTo(1).andParentIdEqualTo(0L);
        List<LmAgent> list = agentService.selectByExample(example);
        return list;
    }

    @RequestMapping(value = "delAgent")
    @ResponseBody
    public String delAgent(HttpServletRequest request ,Long agentId){
        LmAgent agent = agentService.selectByPrimaryKey(agentId);
        agent.setDeleteTime(System.currentTimeMillis());
        agent.setIsDelete(1);
        int flag = agentService.updateByPrimaryKeySelective(agent);
        if(flag>0) {

            return "succ";
        } else {
            return "err";
        }
    }

    @RequestMapping(value = "edit")
    public String edit(HttpServletRequest request,Long agentId ){
        LmAgent agent = agentService.selectByPrimaryKey(agentId);
        if(null != agent) {
            if(!agent.getParentId().equals(0L)) {
                LmAgent parentAgent = agentService.selectByPrimaryKey(agent.getParentId());
                if(null != parentAgent) {
                    request.setAttribute("parentId2", parentAgent.getAgentId());
                    request.setAttribute("parentId1", parentAgent.getParentId());
                    /*if (!parentAgent.getParentId().equals(0L)) {
                        LmAgent parentParentAgent = agentService.selectByPrimaryKey(parentAgent.getParentId());
                        if(parentParentAgent != null) {
                            request.setAttribute("parentId1", parentParentAgent.getAgentId());
                        }
                    }*/
                }
            }
        }
        request.setAttribute("agent", agent);
        return "agent/edit";
    }

    @RequestMapping(value = "updateAgent")
    @ResponseBody
    public String updateAgent(HttpServletRequest request,LmAgent agent,String operateEndStr) {
        //agent.setIsDelete(0);
        //agent.setCreateTime(System.currentTimeMillis());
        agent.setUpdateTime(System.currentTimeMillis());
        //agent.setState(0);
        if(StringUtils.isNotBlank(operateEndStr)) {
            try{
                agent.setOperateEnd(DateUtils.getTimeByformatyyyyMMdd(operateEndStr));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(agent.getLevel().equals(1)) {
            agent.setParentId(0L);
        }

        int flag = agentService.updateByPrimaryKeySelective(agent);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }
}
