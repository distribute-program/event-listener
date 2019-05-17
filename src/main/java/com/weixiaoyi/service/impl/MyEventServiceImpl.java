package com.weixiaoyi.service.impl;

import com.weixiaoyi.dto.SendEventDto;
import com.weixiaoyi.event.RestEvent;
import com.weixiaoyi.service.MyEventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 15:35
 * @description：发布事件service层实现类
 * @modified By：
 * @version: 1.0
 */
@Service
@Slf4j
public class MyEventServiceImpl implements MyEventService {

    @Resource
    private ApplicationContext applicationContext;

    /**
     * @see com.weixiaoyi.service.MyEventService#sendEvent(String)
     *
     */
    @Override
    public String sendEvent(String sendName) {
        log.info("sendEvent  业务执行中.....");

        // 封装参数实体后 发布事件
        SendEventDto sendEventDto = new SendEventDto(sendName);
        applicationContext.publishEvent(new RestEvent(sendEventDto));

        log.info("sendEvent  业务执行完成.....");
        return "sendName";
    }

}
