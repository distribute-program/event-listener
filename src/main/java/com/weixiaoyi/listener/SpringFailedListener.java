package com.weixiaoyi.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 14:47
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Slf4j
@Component
public class SpringFailedListener implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        log.info("ApplicationFailedEvent listener -- 执行了");
    }

}
