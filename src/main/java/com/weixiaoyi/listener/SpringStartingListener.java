package com.weixiaoyi.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 14:43
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Slf4j
@Component
public class SpringStartingListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info("ApplicationStartingEvent listener -- 执行了");
    }

}
