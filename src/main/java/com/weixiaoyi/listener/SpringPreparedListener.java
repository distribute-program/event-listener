package com.weixiaoyi.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 14:45
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Slf4j
@Component
public class SpringPreparedListener implements ApplicationListener<ApplicationPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        log.info("ApplicationPreparedEvent listener -- 执行了");
    }

}
