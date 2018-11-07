package com.lmrd.controller.sensitiveWord;

import com.lmrd.entity.base.PageData;
import com.lmrd.entity.sensitiveWord.LmSensitiveWord;
import com.lmrd.entity.sensitiveWord.LmSensitiveWordExample;
import com.lmrd.service.sensitiveWord.SensitiveWordService;
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
 * @Date: 2018/11/5 11:12
 * @Description:
 */
@Controller
@RequestMapping("sensitiveWord")
public class SensitiveWordController {

    @Autowired
    private SensitiveWordService sensitiveWordService;

    @RequestMapping(value = "/list")
    public String list(ModelMap map, HttpServletRequest request, String sensitiveType, Integer pageNo,Integer pageSize) {
        if (pageNo == null || pageNo.equals("")) {
            pageNo = 1;
        }
        if (pageSize == null || pageSize.equals("")) {
            pageSize = 10;
        }
        PageUtil.startPage(pageNo, pageSize);
        LmSensitiveWordExample example = new LmSensitiveWordExample();
        //
        //example.createCriteria().andSensitiveTypeEqualTo(sensitiveType);
        if (StringUtils.isNotBlank(sensitiveType)) {
            example.createCriteria().andSensitiveTypeEqualTo(sensitiveType);
        }
        //
        example.setOrderByClause("sensitive_word_id DESC");
        List<LmSensitiveWord> list = sensitiveWordService.selectByExample(example);
        PageData pd = new PageData(list);
        PageTag<PageData> pt = new PageTag<PageData>(pd);
        request.setAttribute("pt", pt);
        request.setAttribute("sensitiveType", sensitiveType);
        return "sensitiveWord/list";
    }


    @RequestMapping(value = "/entry")
    public String entry(ModelMap map) {

        return "sensitiveWord/entry";
    }

    /**
     * 保存角色
     * @Description: TODO
     * @param @param request
     * @param @param backRole
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月10日 上午11:09:31
     */
    @RequestMapping(value = "saveSensitiveWord")
    @ResponseBody
    public String saveSensitiveWord(HttpServletRequest request ,LmSensitiveWord sensitiveWord){
        int flag = sensitiveWordService.insert(sensitiveWord);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }


    /**
     * 根据ID删除
     * @param request
     * @param sensitiveWordId
     * @return
     */
    @RequestMapping(value = "delSensitiveWord")
    @ResponseBody
    public String delSensitiveWord(HttpServletRequest request ,Long sensitiveWordId){
        int flag = sensitiveWordService.deleteByPrimaryKey(sensitiveWordId);
        if( flag > 0 ) {
            return "succ";
        } else {
            return "err";
        }
    }


    @RequestMapping(value = "/edit")
    public String edit(ModelMap map,Long sensitiveWordId) {
        LmSensitiveWord sensitiveWord = sensitiveWordService.selectByPrimaryKey(sensitiveWordId);
        map.addAttribute("sensitiveWord" , sensitiveWord);
        return "sensitiveWord/edit";
    }

    /**
     * 修改角色信息
     * @Description: TODO
     * @param @param request
     * @param @param backRole
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月12日 上午11:26:18
     */
    @RequestMapping(value = "updateSensitiveWord")
    @ResponseBody
    public String updateSensitiveWord(HttpServletRequest request , LmSensitiveWord sensitiveWord){
        int flag = sensitiveWordService.updateByPrimaryKeySelective(sensitiveWord);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }
}
