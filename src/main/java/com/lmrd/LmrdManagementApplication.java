package com.lmrd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Configuration
@SpringBootApplication
@MapperScan("com.lmrd.dao")
public class LmrdManagementApplication {

    // 编码过滤器
    @Bean
    Filter characterEncodingFilter() {
        //logger.info("==========初始化编码过滤器=================");
        System.out.println("==========初始化编码过滤器=================");
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return filter;
    }

    /**
     * 文件上传配置
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //文件最大
        factory.setMaxFileSize("10240KB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("102400KB");
        System.out.println("==========初始化文件上传配置=================");
        return factory.createMultipartConfig();
    }

    public static void main(String[] args) throws InterruptedException, TimeoutException, IOException {
        SpringApplication.run(LmrdManagementApplication.class, args);
    }


    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LmrdManagementApplication.class);
    }
}
