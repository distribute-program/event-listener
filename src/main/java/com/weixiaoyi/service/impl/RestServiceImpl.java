package com.weixiaoyi.service.impl;

import com.weixiaoyi.service.RestService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019-5-16 15:32:15
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Service
public class RestServiceImpl implements RestService {

    @Async
    @Override
    public void restServiceOne() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("restServiceOne执行完毕" + Thread.currentThread().getName());
    }

}
