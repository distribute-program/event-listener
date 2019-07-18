package com.weixiaoyi.controller;

import com.weixiaoyi.vo.req.TestBindVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TestEditorController
 * @Description 测试@InitBinder注解使用
 * @Author xxx
 * History:
 * 版本号   作者     日期      操作
 * 1.0     ylWei   2019/7/18   新建
 */
@RestController
@Slf4j
@RequestMapping("binder")
public class TestEditorController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        log.info("initBinder执行了====");
        CustomDateEditor customDateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:SS"), true);
        binder.registerCustomEditor(Date.class, customDateEditor);
    }

    @ResponseBody
    @RequestMapping("testBinder")
    public String testBinder(TestBindVo testBindVo) {
        log.info(testBindVo.toString());
        return testBindVo.toString();
    }

}
