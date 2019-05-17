package com.weixiaoyi.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 14:46
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Slf4j
@Component
public class SpringContextInitializedListener implements ApplicationListener<ApplicationContextInitializedEvent> {

    @Override
    public void onApplicationEvent(ApplicationContextInitializedEvent event) {
        log.info("ApplicationContextInitializedEvent listener -- 执行了");
    }

}
