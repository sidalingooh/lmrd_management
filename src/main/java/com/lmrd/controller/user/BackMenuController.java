package com.lmrd.controller.user;


import com.lmrd.entity.base.PageData;
import com.lmrd.entity.user.BackMenu;
import com.lmrd.entity.user.BackMenuExample;
import com.lmrd.entity.user.BackUser;
import com.lmrd.service.user.BackMenuService;
import com.lmrd.util.PageUtil;
import com.lmrd.util.tag.PageTag;
import com.lmrd.entity.user.BackUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("backMenu")
public class BackMenuController {


    @Autowired
    private BackMenuService backMenuService;

    @RequestMapping(value = "/entry")
    public String entry(ModelMap map) {

        return "backMenu/entry";
    }

    /**
     * 菜单列表
     * @Description: TODO
     * @param @param request
     * @param @param pageNo
     * @param @param peropoty
     * @param @param pageSize
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月10日 上午11:10:33
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @RequestMapping(value = "list")
    public String list(HttpServletRequest request, Integer pageNo,
                       String peropoty, Integer pageSize){
        BackUser backUser = (BackUser) request.getSession().getAttribute("loginUser");
        if(!"1".equals(backUser.getUserType()) && !"0".equals(backUser.getUserType())) {
            return "backMenu/list";
        }
        if (pageNo == null || pageNo.equals("")) {
            pageNo = 1;
        }
        if (pageSize == null || pageSize.equals("")) {
            pageSize = 10;
        }
        PageUtil.startPage(pageNo, pageSize);
        BackMenuExample example = new BackMenuExample();
        List<BackMenu> backMenuList = backMenuService.selectByExample(example);
        PageData pd = new PageData(backMenuList);
        PageTag<PageData> pt = new PageTag<PageData>(pd);
        request.setAttribute("pt", pt);
        return "backMenu/list";
    }

    /**
     * 根据菜单级别查询菜单
     * @Description: TODO
     * @param @param request
     * @param @param level
     * @param @return
     * @return List<BackMenu>
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月10日 上午11:10:41
     */
    @RequestMapping(value = "selectBackMenuByLevel")
    @ResponseBody
    public List<BackMenu> selectBackMenuByLevel(HttpServletRequest request , Integer level){
        BackMenuExample example = new BackMenuExample();
        //if(null != level && "".equals(level)) {
        example.createCriteria().andLevelEqualTo(level);
        //}
        //criteria.andLevelIsNull();
        List<BackMenu> backMenuList = backMenuService.selectByExample(example);
        return backMenuList;
    }

    /**
     * 添加菜单
     * @Description: TODO
     * @param @param request
     * @param @param backMenu
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月10日 上午11:11:04
     */
    @RequestMapping(value = "saveBackMenu")
    @ResponseBody
    public String saveBackMenu(HttpServletRequest request ,BackMenu backMenu){
        int flag = backMenuService.insert(backMenu);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }

    /**
     * 根据ID删除菜单
     * @Description: TODO
     * @param @param request
     * @param @param backMenuId
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月12日 上午11:35:59
     */
    @RequestMapping(value = "delBackMenu")
    @ResponseBody
    public String delBackMenu(HttpServletRequest request ,Long backMenuId){
        BackMenu backMenu = backMenuService.selectByPrimaryKey(backMenuId);
        if("1".equals(backMenu.getLevel())) {

        }
        BackMenuExample backMenuRxample = new BackMenuExample();
        backMenuRxample.createCriteria().andParentIdEqualTo(backMenuId);
        List<BackMenu> parentBackMenuList = backMenuService.selectByExample(backMenuRxample);
        if(null != parentBackMenuList && parentBackMenuList.size()>0) {
            return "backMenuHaveASon";
        }
        int flag = backMenuService.deleteByPrimaryKey(backMenuId);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }

    /**
     * 进入菜单编辑页
     * @Description: TODO
     * @param @param request
     * @param @param backMenuId
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月12日 上午11:36:09
     */
    @RequestMapping(value = "edit")
    public String edit(HttpServletRequest request,Long backMenuId ){
        BackMenu backMenu = backMenuService.selectByPrimaryKey(backMenuId);
        request.setAttribute("backMenu", backMenu);
        return "backMenu/edit";
    }

    /**
     * 修改菜单信息
     * @Description: TODO
     * @param @param request
     * @param @param backMenu
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月12日 上午11:36:20
     */
    @RequestMapping(value = "updateBackMenu")
    @ResponseBody
    public String updateBackMenu(HttpServletRequest request ,BackMenu backMenu){
        int flag = backMenuService.updateByPrimaryKey(backMenu);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }


}
