package com.xxl.job.executor.service.jobhandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import com.xxl.job.core.handler.IJobHandler;

import groovy.util.logging.Slf4j;

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
    
    private static Logger logger = LoggerFactory.getLogger(BeanClassJob.class);
    
    @Override
    public void execute() throws Exception {
        logger.info("bean class job");
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
        XxlJobSpringExecutor.registJobHandler("beanClassJob", this);
    }
}
