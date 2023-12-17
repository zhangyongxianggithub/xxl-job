package com.xxl.job.executor.service.jobhandler;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xxl.job.core.executor.XxlJobExecutor;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.executor.service.JobService;

import lombok.extern.slf4j.Slf4j;

/**
 * @version 1.0
 * @name: zhangyongxiang
 * @author: zhangyongxiang@baidu.com
 * @date 2023/8/23 14:08
 * @description:
 **/
@Slf4j
@Component
public class BeanClassJob extends IJobHandler implements InitializingBean {
    
    private JobService jobService;
    
    @Autowired
    public void setJobService(JobService jobService) {
        this.jobService = jobService;
    }
    
    @Override
    public void execute() throws Exception {
        log.info("bean class job");
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
        XxlJobExecutor.registJobHandler("beanClassJob", this);
    }
}
