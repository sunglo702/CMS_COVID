package com.dmu.covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Author : hadoo
 * @Date : 2020/12/3 15:46
 * 启动类
 */
//@ComponentScan(basePackages = "com.dmu.covid")
    //(exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
@SpringBootApplication
public class CovidApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(CovidApplication.class, args);

    }


    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
        super.addResourceHandlers(registry);
    }
}
