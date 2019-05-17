package com.weixiaoyi.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019-5-16 15:28:42
 * @description：自定义事件
 * @modified By：
 * @version: 1.0
 */
@Slf4j
public class RestEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public RestEvent(Object source) {
        super(source);
        log.info("RestEvent执行了。。。");
    }

}
