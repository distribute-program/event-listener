package com.weixiaoyi.controller;

import com.weixiaoyi.vo.req.TestValidVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestValidController
 * @Description TODO
 * @Author xxx
 * History:
 * 版本号   作者     日期      操作
 * 1.0     ylWei   2019/7/18   新建
 */
@RestController
@RequestMapping("valid")
public class TestValidController {

    @RequestMapping("testValid")
    public String testValid(@Validated TestValidVo validVo) {

        return "请求成功";
    }

}
