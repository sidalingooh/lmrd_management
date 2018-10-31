package com.lmrd.util.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//扩展SpringMVC功能
@Configuration
public class LoginAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new PromiseInterceptor()).addPathPatterns("/**");  //对来自/user/** 这个链接来的请求进行拦截
    }
}
