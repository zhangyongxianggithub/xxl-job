package com.xxl.job.executor.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by zhangyongxiang on 2023/12/17 23:13
 **/
@Slf4j
@Service
public class JobService {
    
    public void printJob() {
        log.error("execute internal job logic");
    }
}
