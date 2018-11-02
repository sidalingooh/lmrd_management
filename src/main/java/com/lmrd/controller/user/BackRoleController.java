package com.lmrd.controller.user;


import com.lmrd.entity.base.PageData;
import com.lmrd.entity.user.*;
import com.lmrd.service.user.BackMenuService;
import com.lmrd.service.user.BackRoleMenuService;
import com.lmrd.service.user.BackRoleService;
import com.lmrd.service.user.BackUserRoleService;
import com.lmrd.util.PageUtil;
import com.lmrd.util.tag.PageTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("backRole")
public class BackRoleController {

    @Autowired
    private BackRoleService backRoleService;

    @Autowired
    private BackMenuService backMenuService;

    @Autowired
    private BackUserRoleService backUserRoleService;

    @Autowired
    private BackRoleMenuService backRoleMenuService;

    @RequestMapping(value = "/entry")
    public String entry(ModelMap map) {

        return "backRole/entry";
    }

    /* 角色列表
	 * @Description: TODO
	 * @param @param request
	 * @param @param pageNo
	 * @param @param peropoty
	 * @param @param pageSize
	 * @param @return
            * @return String
	 * @throws
             * @author LiuSiGuang
	 * @date 2017年10月10日 上午11:09:18
            */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @RequestMapping(value = "list")
    public String list(HttpServletRequest request, Integer pageNo,
                       String peropoty, Integer pageSize){
        if (pageNo == null || pageNo.equals("")) {
            pageNo = 1;
        }
        if (pageSize == null || pageSize.equals("")) {
            pageSize = 10;
        }
        PageUtil.startPage(pageNo, pageSize);
        BackRoleExample example = new BackRoleExample();
        example.setOrderByClause("back_role_id DESC");
        List<BackRole> backRoleList = backRoleService.selectByExample(example);
        PageData pd = new PageData(backRoleList);
        PageTag<PageData> pt = new PageTag<PageData>(pd);
        request.setAttribute("pt", pt);
        return "backRole/list";
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
    @RequestMapping(value = "saveBackRole")
    @ResponseBody
    public String saveBackRole(HttpServletRequest request ,BackRole backRole){
        int flag = backRoleService.insert(backRole);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }



    /**
     * 根据角色ID查询某角色下的菜单
     * @Description: TODO
     * @param @param request
     * @param @param backRoleId
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月10日 上午11:09:45
     */
    @RequestMapping(value = "roleMenu")
    public String roleMenu(HttpServletRequest request , Long backRoleId){

        BackMenuExample backMenuRxample1 = new BackMenuExample();
        backMenuRxample1.createCriteria().andLevelEqualTo(1);
        List<BackMenu> parentBackMenuList = backMenuService.selectByExample(backMenuRxample1);
        BackMenuExample backMenuRxample2 = new BackMenuExample();
        backMenuRxample2.createCriteria().andLevelEqualTo(2);
        List<BackMenu> backMenuList = backMenuService.selectByExample(backMenuRxample2);

        BackRoleMenuExample backRoleMenuExample = new BackRoleMenuExample();
        backRoleMenuExample.createCriteria().andBackRoleIdEqualTo(backRoleId);
        List<BackRoleMenu> backRoleMenuList = backRoleMenuService.selectByExample(backRoleMenuExample);
        request.setAttribute("parentBackMenuList", parentBackMenuList);
        request.setAttribute("backMenuList", backMenuList);
        request.setAttribute("backRoleMenuList", backRoleMenuList);
        request.setAttribute("backRoleId", backRoleId);
        return "backRole/roleMenu";
    }

    /**
     * 根据用户类型查询角色
     * @Description: TODO
     * @param @param request
     * @param @param userType
     * @param @return
     * @return List<BackRole>
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月10日 上午11:10:06
     */
    @RequestMapping(value = "selectBackRoleByUserType")
    @ResponseBody
    public List<BackRole> selectBackRoleByUserType(HttpServletRequest request , String userType){
        BackRoleExample example = new BackRoleExample();
        example.createCriteria().andRoleSetEqualTo(userType);
        List<BackRole> backRoleList = backRoleService.selectByExample(example);
        return backRoleList;
    }

    /**
     * 保存角色下的菜单
     * @Description: TODO
     * @param @param request
     * @param @param menuIdList
     * @param @param backRoleId
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月10日 上午11:10:22
     */
    @RequestMapping(value = "saveRoleMenu")
    @ResponseBody
    public String saveRoleMenu(HttpServletRequest request ,String menuIdList,Long backRoleId){
        int flag = backRoleMenuService.updateRoleMenu(menuIdList, backRoleId);
        //int flag = backRoleService.insert(backRole);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }

    /**
     * 根据角色ID删除该角色
     * @Description: TODO
     * @param @param request
     * @param @param backRoleId
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月12日 上午10:30:09
     */
    @RequestMapping(value = "delBackRole")
    @ResponseBody
    public String delBackRole(HttpServletRequest request ,Long backRoleId){

        //判断角色是否被使用  如被使用则无法删除
        BackUserRoleExample example = new BackUserRoleExample();
        example.createCriteria().andBackRoleIdEqualTo(backRoleId);
        List<BackUserRole> backUserRoleList = backUserRoleService.selectByExample(example);
        if(null != backUserRoleList && backUserRoleList.size()>0) {
            return "backRoleIsUsing";
        }

        //判断角色下是否有菜单   删除该角色对应的菜单关系
        BackRoleMenuExample backRoleMenuExample = new BackRoleMenuExample();
        backRoleMenuExample.createCriteria().andBackRoleIdEqualTo(backRoleId);
        List<BackRoleMenu> backRoleMenuList = backRoleMenuService.selectByExample(backRoleMenuExample);
        if(null != backRoleMenuList && backRoleMenuList.size()>0) {
            backRoleMenuService.deleteByExample(backRoleMenuExample);
        }


        //删除角色
        int flag = backRoleService.deleteByPrimaryKey(backRoleId);
        //int flag = backRoleService.insert(backRole);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }

    /**
     * 根据角色ID查询角色信息
     * @Description: TODO
     * @param @param request
     * @param @param backRoleId
     * @param @return
     * @return BackRole
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月12日 上午10:53:42
     */
    @RequestMapping(value = "selectBackRoleByBackRoleId")
    @ResponseBody
    public BackRole selectBackRoleByBackRoleId(HttpServletRequest request , Long backRoleId){
        BackRole backRole = backRoleService.selectByPrimaryKey(backRoleId);
        return backRole;
    }

    @RequestMapping(value = "/edit")
    public String edit(ModelMap map,Long backRoleId) {
        BackRole backRole = backRoleService.selectByPrimaryKey(backRoleId);
        map.addAttribute("backRole" , backRole);
        return "backRole/edit";
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
    @RequestMapping(value = "updateBackRole")
    @ResponseBody
    public String updateBackRole(HttpServletRequest request ,BackRole backRole){
        int flag = backRoleService.updateByPrimaryKeySelective(backRole);
        if(flag>0) {
            return "succ";
        } else {
            return "err";
        }
    }


}
