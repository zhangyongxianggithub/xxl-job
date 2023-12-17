package com.xxl.job.executor.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * xxl-job config
 *
 * @author xuxueli 2017-04-28
 */
@Slf4j
//@Configuration
public class XxlJobConfig {
    
//    @Bean
//    public XxlJobSpringExecutor xxlJobExecutor(
//            XxlJobExecutorProperties properties) {
//        log.warn(">>>>>>>>>>> xxl-job config init. {}",
//                JSONUtil.toJsonStr(properties));
//        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
//        xxlJobSpringExecutor.setAdminAddresses(properties);
//        xxlJobSpringExecutor.setAppname(properties.appname);
//        xxlJobSpringExecutor.setAddress(properties.address);
//        xxlJobSpringExecutor.setIp(properties.ip);
//        xxlJobSpringExecutor.setPort(properties.port);
//        xxlJobSpringExecutor.setAccessToken(properties.accessToken);
//        xxlJobSpringExecutor.setLogPath(properties.logPath);
//        xxlJobSpringExecutor.setLogRetentionDays(properties.logRetentionDays);
//        return xxlJobSpringExecutor;
//    }
    
}