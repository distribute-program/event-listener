package com.weixiaoyi.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019-5-16 14:38:08
 * @description：可以传入不通泛型 进行在spring启动的不同时期 进行执行
 * @modified By：
 * @version: 1.0
 */
@Slf4j
@Component
public class SpringStartListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("ApplicationStartedEvent listener -- 执行了");
    }

}
