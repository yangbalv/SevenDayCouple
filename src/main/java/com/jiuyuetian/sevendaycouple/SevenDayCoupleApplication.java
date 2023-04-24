package com.jiuyuetian.sevendaycouple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication

@ServletComponentScan
public class SevenDayCoupleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SevenDayCoupleApplication.class, args);
    }

}
