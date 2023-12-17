package com.xxl.job.executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@EnableConfigurationProperties
@SpringBootApplication
public class ZyxXxlJobExecutorApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ZyxXxlJobExecutorApplication.class, args);
    }
    
}