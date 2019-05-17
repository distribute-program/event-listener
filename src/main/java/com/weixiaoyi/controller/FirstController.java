package com.weixiaoyi.controller;

import com.weixiaoyi.event.RestEvent;
import com.weixiaoyi.service.RestService;
import com.weixiaoyi.vo.RestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/14 17:53
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@Slf4j
public class FirstController {

    @Resource
    private ApplicationContext applicationContext;

    @Resource
    private RestService restService;

    @RequestMapping("restOne")
    public String restOne() {
        log.info("restOne");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }

    /**
     * 调用service异步执行方法
     *
     * @return
     */
    private String method_2() {
        restService.restServiceOne();
        System.out.println("restOne执行完毕" + Thread.currentThread().getName());
        return "aaa";
    }

    /**
     * 手动发布事件
     *
     * @return
     */
    private String method_1() {
        RestVo restVo = new RestVo("--restName--", "--restDesc--");
        applicationContext.publishEvent(new RestEvent(restVo));
        // System.out.println("restOne执行完成");
        return "aaa";
    }

}
