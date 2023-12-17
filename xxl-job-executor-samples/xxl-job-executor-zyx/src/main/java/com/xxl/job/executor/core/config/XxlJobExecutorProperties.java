package com.xxl.job.executor.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;

import cn.hutool.json.JSONUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by zhangyongxiang on 2023/12/17 23:26
 **/
@Slf4j
@Data
@Component
@ConfigurationProperties(prefix = "xxl.job")
public class XxlJobExecutorProperties {
    
    private String adminAddresses;
    
    private String accessToken;
    
    private String appname;
    
    private String address;
    
    private String ip;
    
    private int port;
    
    private String logPath;
    
    private int logRetentionDays;
    
    @Bean
    public XxlJobSpringExecutor xxlJobExecutor() {
        log.warn(">>>>>>>>>>> xxl-job config init. {}",
                JSONUtil.toJsonStr(this));
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(this.adminAddresses);
        xxlJobSpringExecutor.setAppname(this.appname);
        xxlJobSpringExecutor.setAddress(this.address);
        xxlJobSpringExecutor.setIp(this.ip);
        xxlJobSpringExecutor.setPort(this.port);
        xxlJobSpringExecutor.setAccessToken(this.accessToken);
        xxlJobSpringExecutor.setLogPath(this.logPath);
        xxlJobSpringExecutor.setLogRetentionDays(this.logRetentionDays);
        return xxlJobSpringExecutor;
    }
}
