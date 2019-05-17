package com.weixiaoyi.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 14:42
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Slf4j
@Component
public class SpringReadyListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("ApplicationReadyEvent listener -- 执行了");
    }

}
