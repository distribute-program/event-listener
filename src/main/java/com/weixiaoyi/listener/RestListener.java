package com.weixiaoyi.listener;

import com.weixiaoyi.event.RestEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019-5-16 15:28:21
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
@Slf4j
public class RestListener implements ApplicationListener<RestEvent> {

    @Override
    public void onApplicationEvent(RestEvent event) {
        log.info("自定义  RestListener执行了。。。。 参数为：{}",event.getSource());
    }

}
