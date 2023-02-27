package com.example.lww_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.lww_springboot.mapper")
public class LwwSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LwwSpringbootApplication.class, args);
    }

}
