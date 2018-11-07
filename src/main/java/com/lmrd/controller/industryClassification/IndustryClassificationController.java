package com.lmrd.controller.industryClassification;

import com.lmrd.entity.base.PageData;
import com.lmrd.entity.industryClassification.LmIndustryClassification;
import com.lmrd.entity.industryClassification.LmIndustryClassificationExample;
import com.lmrd.service.industryClassification.IndustryClassificationService;
import com.lmrd.util.PageUtil;
import com.lmrd.util.tag.PageTag;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Auther: teck
 * @Date: 2018/11/5 16:35
 * @Description:
 */
@Controller
@RequestMapping("industryClassification")
public class IndustryClassificationController {


    @Autowired
    private IndustryClassificationService industryClassificationService;

    @RequestMapping(value = "/list")
    public String list(ModelMap map, HttpServletRequest request, Integer pageNo, Integer pageSize,String industryClassificationName) {
        if (pageNo == null || pageNo.equals("")) {
            pageNo = 1;
        }
        if (pageSize == null || pageSize.equals("")) {
            pageSize = 10;
        }
        PageUtil.startPage(pageNo, pageSize);
        LmIndustryClassificationExample example = new LmIndustryClassificationExample();
        //
        //example.createCriteria().andSensitiveTypeEqualTo(sensitiveType);

        //
        example.createCriteria().andIsDeleteNotEqualTo(1);
        if(StringUtils.isNotBlank(industryClassificationName)) {
            example.createCriteria().andIndustryClassificationNameLike("%" + industryClassificationName + "%");
        }
        example.setOrderByClause("update_time DESC");
        List<LmIndustryClassification> list = industryClassificationService.selectByExample(example);
        PageData pd = new PageData(list);
        PageTag<PageData> pt = new PageTag<PageData>(pd);
        request.setAttribute("pt", pt);
        request.setAttribute("industryClassificationName", industryClassificationName);
        return "industryClassification/list";
    }

    @RequestMapping(value = "/entry")
    public String entry(HttpServletRequest request, ModelMap map) {
        LmIndustryClassificationExample example = new LmIndustryClassificationExample();
        example.createCriteria().andParentIdEqualTo(0L);
        //example.
        //List<LmIndustryClassification> list = industryClassificationService.selectByExample(example);
        //request.setAttribute("list", list);
        return "industryClassification/entry";
    }

    @RequestMapping(value = "/selectByParentId")
    @ResponseBody
    public List<LmIndustryClassification> selectByParentId(ModelMap map, Long parentId,Integer level) {
        LmIndustryClassificationExample example = new LmIndustryClassificationExample();
        example.createCriteria().andIsDeleteNotEqualTo(1);
        if(null != parentId) {
            example.createCriteria().andParentIdEqualTo(parentId);
        }
        if(null != level) {
            example.createCriteria().andLevelEqualTo(level);
        }

        //example.
        List<LmIndustryClassification> list = industryClassificationService.selectByExample(example);
        return list;
    }

    @RequestMapping(value = "saveIndustryClassification")
    @ResponseBody
    public String saveIndustryClassification(HttpServletRequest request ,LmIndustryClassification industryClassification){
        industryClassification.setCreateTime(System.currentTimeMillis());
        industryClassification.setUpdateTime(System.currentTimeMillis());
        industryClassification.setIsDelete(0);
        int flag = industryClassificationService.insert(industryClassification);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }


    @RequestMapping(value = "edit")
    public String edit(HttpServletRequest request,Long industryClassificationId ){
        LmIndustryClassification industryClassification = industryClassificationService.selectByPrimaryKey(industryClassificationId);
        request.setAttribute("industryClassification", industryClassification);
        return "industryClassification/edit";
    }

    @RequestMapping(value = "updateIndustryClassification")
    @ResponseBody
    public String updateIndustryClassification(HttpServletRequest request ,LmIndustryClassification industryClassification){
        industryClassification.setUpdateTime(System.currentTimeMillis());
        int flag = industryClassificationService.updateByPrimaryKeySelective(industryClassification);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }

    @RequestMapping(value = "getAllIndustryClassificationListLevel1")
    @ResponseBody
    public List<LmIndustryClassification> getAllIndustryClassificationListLevel1(HttpServletRequest request ){
        LmIndustryClassificationExample example = new LmIndustryClassificationExample();
        example.createCriteria().andIsDeleteNotEqualTo(1).andParentIdEqualTo(0L);
        example.setOrderByClause("update_time DESC");
        List<LmIndustryClassification> list = industryClassificationService.selectByExample(example);
        return list;
    }


    @RequestMapping(value = "getIndustryClassificationListByParentId")
    @ResponseBody
    public List<LmIndustryClassification> getIndustryClassificationListByParentId(HttpServletRequest request, Long  parentId){
        if(null == parentId || "".equals(parentId)) {
            return null;
        }
        LmIndustryClassificationExample example = new LmIndustryClassificationExample();
        example.createCriteria().andIsDeleteNotEqualTo(1).andParentIdEqualTo(parentId);
        example.setOrderByClause("update_time DESC");
        List<LmIndustryClassification> list = industryClassificationService.selectByExample(example);
        return list;
    }

    @RequestMapping(value = "delIndustryClassification")
    @ResponseBody
    public String delIndustryClassification(HttpServletRequest request ,Long industryClassificationId){
        LmIndustryClassification industryClassification = industryClassificationService.selectByPrimaryKey(industryClassificationId);
        if("1".equals(industryClassification.getLevel())) {

        }
        LmIndustryClassificationExample backMenuRxample = new LmIndustryClassificationExample();
        backMenuRxample.createCriteria().andParentIdEqualTo(industryClassificationId);
        backMenuRxample.createCriteria().andIsDeleteNotEqualTo(1);
        List<LmIndustryClassification> parentList = industryClassificationService.selectByExample(backMenuRxample);
        if(null != parentList && parentList.size()>0) {
            return "industryClassificationHaveASon";
        }
        industryClassification.setIsDelete(1);
        industryClassification.setDeleteTime(System.currentTimeMillis());
        int flag = industryClassificationService.updateByPrimaryKeySelective(industryClassification);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }
}
