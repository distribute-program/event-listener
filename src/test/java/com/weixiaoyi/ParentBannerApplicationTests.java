package com.weixiaoyi;

import com.weixiaoyi.controller.FirstController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParentBannerApplicationTests {

    @Resource
    private FirstController firstController;

    @Test
    public void contextLoads() {
        System.out.println(firstController.restOne());
    }

}
