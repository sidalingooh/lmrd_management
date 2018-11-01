package com.lmrd.controller.user;


import com.lmrd.entity.base.PageData;
import com.lmrd.entity.user.BackUser;
import com.lmrd.entity.user.BackUserExample;
import com.lmrd.entity.user.BackUserRole;
import com.lmrd.entity.user.BackUserRoleExample;
import com.lmrd.service.region.RegionService;
import com.lmrd.service.user.BackMenuService;
import com.lmrd.service.user.BackUserRoleService;
import com.lmrd.service.user.BackUserService;
import com.lmrd.util.MD5;
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

@Controller
@RequestMapping("backUser")
public class BackUserController {

    @Autowired
    private BackUserService backUserService;

    @Autowired
    private BackMenuService backMenuService;

    @Autowired
    private BackUserRoleService backUserRoleService;

    @Autowired
    private RegionService regionService;


    @RequestMapping(value = "/entry")
    public String entry(ModelMap map) {

        return "backUser/entry";
    }

    @RequestMapping(value = "/list")
    public String list(ModelMap map,HttpServletRequest request, Integer pageNo,
                        String peropoty, Integer pageSize,String username) {
        BackUser backUser = (BackUser) request.getSession().getAttribute("loginUser");
        if (pageNo == null || pageNo.equals("")) {
            pageNo = 1;
        }
        if (pageSize == null || pageSize.equals("")) {
            pageSize = 3;
        }
        PageUtil.startPage(pageNo, pageSize);
        BackUserExample example = new BackUserExample();
        if(backUser.getUserType().equals(1)) {
            example.createCriteria().andUserTypeEqualTo(2);
        } else if(backUser.getUserType().equals(2)) {
            example.createCriteria().andUserTypeEqualTo(3);
        }
        if(StringUtils.isNotBlank(username)) {
            example.createCriteria().andUserNameLike("%" + username + "%");
        }

        List<BackUser> backUserList = backUserService.selectByExample(example);
        PageData pd = new PageData(backUserList);
        PageTag<PageData> pt = new PageTag<PageData>(pd);
        request.setAttribute("username", username);
        request.setAttribute("pt", pt);
        return "backUser/list";
    }


    /**
     * 保存用户
     * @Description: TODO
     * @param @param request
     * @param @param userName
     * @param @param realName
     * @param @param password
     * @param @param enable
     * @param @param userType
     * @param @param mobile
     * @param @param email
     * @param @param roleId
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月10日 上午11:08:39
     */
    @RequestMapping(value = "saveBackUser")
    @ResponseBody
    public String saveBackUser(HttpServletRequest request,String userName,String realName,
                               String password,Integer enable,Integer userType,String mobile,String email,Long roleId,String provinceId,
                               String cityId,String districtId,String provinceName,String cityName, String districtName){
        BackUser backUser = new BackUser();
        backUser.setUserName(userName);
        backUser.setRealName(realName);
        backUser.setUserType(userType);
        backUser.setMobile(mobile);
        backUser.setEmail(email);
        backUser.setEnable(enable);
        backUser.setPassword(MD5.getMD5ofStr(password));
        backUser.setCreateTime(System.currentTimeMillis());
        backUser.setUpdateTime(System.currentTimeMillis());
        /*backUser.setProvinceId(provinceId);
        backUser.setProvinceName(provinceName);
        backUser.setCityId(cityId);
        backUser.setCityName(cityName);
        backUser.setDistrictId(districtId);
        backUser.setDistrictName(districtName);*/
        int flag = backUserService.insert(backUser);
        System.out.println("backUser.getBackUserId():"+backUser.getBackUserId());
        if(flag>0) {
            if(null!= roleId && !"".equals(roleId)) {
                BackUserRole backUserRole = new BackUserRole();
                backUserRole.setBackRoleId(roleId);
                backUserRole.setBackUserId(backUser.getBackUserId());
                backUserRoleService.insert(backUserRole);
            }
            return "succ";
        }
        return "err";
    }

    /**
     * 进入用户编辑页面
     * @Description: TODO
     * @param @param request
     * @param @param backUserId
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月10日 上午11:08:45
     */
    @RequestMapping(value = "edit")
    public String edit(HttpServletRequest request,Long backUserId ){
        BackUser backUser = backUserService.selectByPrimaryKey(backUserId);
        BackUserRoleExample example = new BackUserRoleExample();
        example.createCriteria().andBackUserIdEqualTo(backUserId);
        List<BackUserRole> bakcUserRoleList = backUserRoleService.selectByExample(example);
        if(null != bakcUserRoleList && bakcUserRoleList.size()>0) {
            request.setAttribute("backUserRole", bakcUserRoleList.get(0));
        }
        request.setAttribute("backUser", backUser);
        return "backUser/edit";
    }

    /**
     * 修改用户信息
     * @Description: TODO
     * @param @param request
     * @param @param backUserRoleId
     * @param @param backRoleId
     * @param @param backUserId
     * @param @param userName
     * @param @param realName
     * @param @param password
     * @param @param enable
     * @param @param userType
     * @param @param mobile
     * @param @param email
     * @param @param roleId
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月12日 上午11:37:00
     */
    @RequestMapping(value = "updateBackUser")
    @ResponseBody
    public String updateBackUser(HttpServletRequest request,Long backUserRoleId,Long backRoleId,Long backUserId,String userName,String realName,
                                 String password,Integer enable,Integer userType,String mobile,String email,Long roleId){
        BackUser backUser = backUserService.selectByPrimaryKey(backUserId);
        backUser.setUserName(userName);
        backUser.setRealName(realName);
        backUser.setUserType(userType);
        backUser.setMobile(mobile);
        backUser.setEmail(email);
        backUser.setEnable(enable);
        backUser.setUpdateTime(System.currentTimeMillis());
        //backUser.setPassword(MD5.getMD5ofStr(password));
        int flag = backUserService.updateByPrimaryKeySelective(backUser);
        System.out.println("backUser.getBackUserId():"+backUser.getBackUserId());
        if(flag>0) {
            if(null!= roleId && !"".equals(roleId) && !roleId.equals(backRoleId)) {

				/*BackUserRoleExample example = new BackUserRoleExample();
				com.sswh.meto.entity.BackUserRoleExample.Criteria criteria = example.createCriteria();
				criteria.andBackUserIdEqualTo(backUserId);
				backUserRoleService.deleteByExample(example);*/
                BackUserRole backUserRole = backUserRoleService.selectByPrimaryKey(backUserRoleId);
                backUserRole.setBackRoleId(roleId);
                backUserRole.setBackUserId(backUser.getBackUserId());
                backUserRoleService.updateByPrimaryKeySelective(backUserRole);
            } else {
                if(null != backUserRoleId && "".equals(backUserRoleId)) {
                    backUserRoleService.deleteByPrimaryKey(backUserRoleId);
                }
            }
            return "succ";
        }
        return "err";
    }

    /**
     * 查询该用户名是否存在
     * @Description: TODO
     * @param @param request
     * @param @param userName
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月10日 上午11:08:56
     */
    @RequestMapping(value = "selectUserByUserName")
    @ResponseBody
    public String selectUserByUserName(HttpServletRequest request ,String userName){
        BackUserExample example = new BackUserExample();
        example.createCriteria().andUserNameEqualTo(userName);
        List<BackUser> backUserList = backUserService.selectByExample(example);
        if(null != backUserList && backUserList.size()>0) {
            return "userNameBeing";
        }
        return "";
    }

    /**
     * 删除用户
     * @Description: TODO
     * @param @param request
     * @param @param backUserId
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月12日 上午11:37:13
     */
    @RequestMapping(value = "delBackUser")
    @ResponseBody
    public String delBackUser(HttpServletRequest request ,Long backUserId){
        int flag = backUserService.deleteByPrimaryKey(backUserId);
        if(flag>0) {
            BackUserRoleExample example = new BackUserRoleExample();
            example.createCriteria().andBackUserIdEqualTo(backUserId);
            backUserRoleService.deleteByExample(example);
            return "succ";
        }
        return "err";
    }


}
