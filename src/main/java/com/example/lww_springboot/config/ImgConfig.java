package com.example.lww_springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ImgConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //硬盘虚拟映射，是将http://localhost:8081/image/**==>D:/image/**
        registry.addResourceHandler("/image/**").
                addResourceLocations("file:D:/image/");
    }
}

