package com.weixiaoyi.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 14:32
 * @description：第三个启动运行类
 * @modified By：
 * @version: 1.0
 */
@Slf4j
@Component
@Order(3)
public class MyThiredRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("Thired  Runner  --  执行了。。。");
    }

}
