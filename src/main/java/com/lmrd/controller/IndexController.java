package com.lmrd.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.lmrd.entity.user.BackMenu;
import com.lmrd.entity.user.BackUser;
import com.lmrd.service.user.BackMenuService;
import com.lmrd.service.user.BackUserService;
import com.lmrd.util.LoginUserMap;
import com.lmrd.util.MD5;
import org.apache.commons.lang.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Auther: teck
 * @Date: 2018/10/30 18:04
 * @Description:
 */
@Controller
public class IndexController {

    @Autowired
    private BackUserService backUserService;

    @Autowired
    private BackMenuService backMenuService;

    @RequestMapping(value = "/index")
    public String index(ModelMap map, Integer pageNo, Integer pageSize) {
        map.addAttribute("content","11111111111111111111111111222222222222222");
        return "index";
    }

    @RequestMapping(value = "/auth")
    public String auth(ModelMap map, Integer pageNo, Integer pageSize) {

        return "login/login";
    }

    @RequestMapping(value = "/selectMenuByUser")
    @ResponseBody
    public JSONObject selectMenuByUser(HttpServletRequest request) {
        BackUser backUser = (BackUser) request.getSession().getAttribute("loginUser");
        List<BackMenu> menuList = backMenuService.selectByBackUserId(backUser.getBackUserId());
        JSONArray menuJsonArray = new JSONArray();
        Integer level = 1;
        for (BackMenu menu : menuList) {
            if(level.equals(menu.getLevel())) {
                //System.out.println(menu.getName());
                JSONObject object = new JSONObject();
                object.put("text",menu.getName());
                //object.put("href",menu.getUrl());
                if(null != menu.getIcon()) {
                    object.put("icon",menu.getIcon());
                } else {
                    object.put("icon","");
                }
                JSONArray jsonArray = new JSONArray();
                for(BackMenu menu2 : menuList){
                    if(menu2.getParentId().equals(menu.getBackMenuId())){
                        JSONObject object2 = new JSONObject();
                        object2.put("text",menu2.getName());
                        if(null != menu2.getIcon()) {
                            object2.put("icon",menu2.getIcon());
                        } else {
                            object2.put("icon","");
                        }
                        object2.put("href",menu2.getUrl());
                        jsonArray.add(object2);
                    }
                }
                object.put("subset",jsonArray);
                menuJsonArray.add(object);
            }
        }
        JSONObject menuJson = new JSONObject();
        menuJson.put("data",menuJsonArray);
        //System.out.println(menuJson.toString());
        return menuJson;
    }

    @RequestMapping(value = "/welcome")
    public String welcome(ModelMap map, HttpServletRequest request) {

        return "login/welcome";
    }

    @RequestMapping(value = "/main")
    public String main(ModelMap map, HttpServletRequest request) {

        return "login/main";
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(HttpServletRequest request, ModelMap map, String userName, String password) {
        JSONObject object = new JSONObject();
        HttpSession session = request.getSession();
        try {
            System.out.println("登录参数  用户名:"+userName+"密码:"+password);
            //判断参数是否为空
            if(StringUtils.isBlank(userName) || StringUtils.isBlank(password)){
                object.put("result", 3);
                object.put("type","参数异常,请重新填写!");
                return object.toString();
            }else{
                //根据登录名称获取信息
                BackUser backUser = backUserService.selectByUserName(userName);
                //判断查询的登录名称是否为空
                if(backUser != null){
                    if(StringUtils.isNotBlank(backUser.getUserName()) && StringUtils.isNotBlank(backUser.getPassword())){
                        if("1".equals(backUser.getEnable())) {
                            object.put("result", 1);
                            object.put("type", "用户状态不可用");
                            return object.toString();
                        }

                        //不为空判断密码正确
                        if(backUser.getPassword().equals(MD5.getMD5ofStr(password))){
                            //密码正确，保存到session中，跳转到首页面
                            LoginUserMap.setLoginUsers(backUser.getBackUserId(), session.getId());//保存sessionId到map中
                            session.setAttribute("loginUser", backUser);
                            //跳转到首页
                            //ok的时候返回数据
                            object.put("result", "0");
                            //用户的性质为城市经理普通用过户或者是手机登录用户
                            //object.put("type", backUser.getUsertype());
                            return object.toString();
                        }else{
                            object.put("result", 2);
                            object.put("type", "密码错误");
                            return object.toString();
                        }
                    }else{
                        object.put("result", 1);
                        object.put("type", "该用户不存在");
                        return object.toString();
                    }
                }else{
                    object.put("result", 1);
                    object.put("type", "该用户不存在");
                    return object.toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                object.put("result", 3);
                object.put("type", "登录异常,请稍后再试!");
                return object.toString();
            } catch (JSONException e1) {
                e1.printStackTrace();
            }
        }
        return "";
    }

    /**
     * 登出
     * @Description: TODO
     * @param @param request
     * @param @return
     * @return String
     * @throws
     * @author LiuSiGuang
     * @date 2017年10月12日 上午11:39:16
     */
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("loginUser");
        return "login/auth";
    }


}
