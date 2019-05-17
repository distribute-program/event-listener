package com.weixiaoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 *
 *
 */
@SpringBootApplication
@EnableAsync
public class ParentBannerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParentBannerApplication.class, args);
    }

}
