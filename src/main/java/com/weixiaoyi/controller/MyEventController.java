package com.weixiaoyi.controller;

import com.weixiaoyi.event.RestEvent;
import com.weixiaoyi.service.MyEventService;
import com.weixiaoyi.vo.RestVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 15:33
 * @description：发布事件控制器
 * @modified By：
 * @version: 1.0
 */
@RestController
@Slf4j
@Api(value = "事件处理控制器", tags = "事件处理控制器")
public class MyEventController {

    /** 事件发布service层对象 */
    @Resource
    private MyEventService eventService;

    @ApiOperation(value = "发布事件", notes = "发布事件")
    @PostMapping("sendEvent")
    public String sendEvent(@RequestParam String sendName) {
        eventService.sendEvent(sendName);

        return "success";
    }

}
