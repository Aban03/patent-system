package com.suixingpay.patent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.suixingpay.patent.dao")
public class PatentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PatentApplication.class,args);
    }
}
