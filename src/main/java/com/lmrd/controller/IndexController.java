package com.lmrd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: teck
 * @Date: 2018/10/30 18:04
 * @Description:
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(ModelMap map, Integer pageNo, Integer pageSize) {
        map.addAttribute("content","11111111111111111111111111222222222222222");
        return "index";
    }
}
