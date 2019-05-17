package com.weixiaoyi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 10:12
 * @description：测试swagger
 * @modified By：
 * @version: 1.0
 */
@Api(value = "swagger测试控制类", tags = "swagger测试控制类")
@RestController
@Slf4j
public class SwaggerController {

    @PostMapping("testSwagger")
    @ApiOperation(value = "swagger测试方法", notes = "swagger测试方法")
    @ApiImplicitParam(value = "名称", name = "swaggerName", paramType = "query", required = true, dataType = "String")
    public String testSwagger(String swaggerName) {
        log.info("参数为：{}", swaggerName);
        return "你好啊";
    }

}
