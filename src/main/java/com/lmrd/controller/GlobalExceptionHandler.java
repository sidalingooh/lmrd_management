package com.lmrd.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: LiuSiGuang
 * @Date: 2018/11/6 16:12
 * @Description:
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {}


    @ExceptionHandler(value = Exception.class)
    public String defaulErrorHandler(HttpServletRequest request, Exception e) throws  Exception{
        request.setAttribute("exception",e);
        request.setAttribute("url","请求路径：" + request.getRequestURI());
        //返回异常处理页面
        return "error/error";
    }

    /**
     * @ExceptionHandler 匹配抛出自定义的异常类型 MyException
     * ErrorInfo<String> 为自定义的一个数据封装类，用于返回的json数据
     * 如果返回的是json格式，需要加上@ResponsBody
     */

}
