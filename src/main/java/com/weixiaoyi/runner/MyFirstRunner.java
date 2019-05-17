package com.weixiaoyi.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/14 17:56
 * @description：第一个启动运行类
 * @modified By：
 * @version: 1.0
 */
@Order(value = 1)
@Component
@Slf4j
public class MyFirstRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("first  Runner  --  执行了。。。");
    }

}
