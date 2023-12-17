package com.xxl.job.executor.service.jobhandler;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by zhangyongxiang on 2023/12/17 23:12
 **/
@Slf4j
@Component
public class XxlJobs {
    
    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("zyxDemoJobHandler")
    public void demoJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, Hello World.");
        log.info("demoJobHandler execute: " + LocalDateTime.now());
        for (int i = 0; i < 5; i++) {
            XxlJobHelper.log("beat at:" + i);
            TimeUnit.SECONDS.sleep(2);
        }
        // default success
    }
    
    @XxlJob("zyxShardingJobHandler")
    public void shardingJobHandler() throws Exception {
        
        // 分片参数
        int shardIndex = XxlJobHelper.getShardIndex();
        int shardTotal = XxlJobHelper.getShardTotal();
        
        XxlJobHelper.log("分片参数：当前分片序号 = {}, 总分片数 = {}", shardIndex, shardTotal);
        
        // 业务逻辑
        for (int i = 0; i < shardTotal; i++) {
            if (i == shardIndex) {
                XxlJobHelper.log("第 {} 片, 命中分片开始处理", i);
            } else {
                XxlJobHelper.log("第 {} 片, 忽略", i);
            }
        }
        
    }
}
