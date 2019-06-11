package com.weixiaoyi.listener;

import com.weixiaoyi.event.RestEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019-5-16 16:09:46
 * @description：注解使用
 * @modified By：
 * @version: 1.0
 */
@Component
@Slf4j
public class SpringStartAnnoListener {

    /**
     * 如果使用异步执行 一定要配合 @EnableAsync 使用，方能生效
     *
     * @param restVo
     */
    @Async
    @EventListener(classes = {RestEvent.class})
    public void listenAnno(RestEvent restVo) {
        log.info("listenAnno excute。。。，参数为：{}", restVo.getSource());
    }

    @EventListener(ApplicationStartedEvent.class)
    public void listenSpringStarted(ApplicationStartedEvent restVo) {
        log.info("ApplicationStartedEvent  注解实现执行了。。。");
    }

}
