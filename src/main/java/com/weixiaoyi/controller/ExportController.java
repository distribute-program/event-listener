package com.weixiaoyi.controller;

import cn.hutool.core.annotation.AnnotationUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.weixiaoyi.annotations.ExportTitle;
import com.weixiaoyi.model.ExportWalletUserBo;
import com.weixiaoyi.model.UserModel;
import com.weixiaoyi.util.ExportUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName ExportController.java
 * @Description 导出工具前端控制器
 * @createTime 2020年06月16日 19:36:00
 * @updateBy
 * @updateTime
 */
@Api(value = "导出工具前端控制器", tags = "导出工具前端控制器")
@RestController
@Slf4j
public class ExportController {

    @GetMapping("testGetAnnotations")
    @ApiOperation(value = "测试获取注解", notes = "测试获取注解")
    public void testGetAnnotations() {
        Object annotationValue = AnnotationUtil.getAnnotationValue(UserModel.class, ExportTitle.class);
        log.info("类上注解为：{}", annotationValue);

        Field[] fields = UserModel.class.getDeclaredFields();
        for (Field field : fields) {
            String title = AnnotationUtil.getAnnotationValue(field, ExportTitle.class,"title");

            Integer width = AnnotationUtil.getAnnotationValue(field, ExportTitle.class,"width");
            log.info("属性：{}，标题为：{}， 宽度为：{}", field.getName(), title, width);
        }
    }

    @GetMapping("export")
    @ApiOperation(value = "测试导出", notes = "测试导出")
    public void export(HttpServletResponse response) throws IOException {

        /*List<ExportWalletUserBo> userModels = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            ExportWalletUserBo userModel = new ExportWalletUserBo();
            userModel.setUserName("辉煌国际一号楼1007啊啊啊啊啊 。地址" + i);
            userModel.setBalanceAmount(new BigDecimal("300").multiply(new BigDecimal(i)));
            userModel.setCellPhone("电话号 1565656465688626165656" + i);
            userModel.setUserName("姓名" + i);
            userModel.setCreateTime(new Date());
            userModel.setCreateTime2("2020-06-22 00:22:22");
            userModels.add(userModel);
        }*/
        List<UserModel> userModels = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            UserModel userModel = new UserModel();
            // userModel.setAddress("辉煌国际一号楼1007啊啊啊啊啊 。地址" + i);
            userModel.setAge(i);
            userModel.setTelephone("电话号 1565656465688626165656" + i);
            userModel.setAddress("电话号 1565656465688626165656" + i);
            userModel.setUserName("姓名" + i);
            userModels.add(userModel);
        }
        ExportUtils.exportXlsx(response, userModels,UserModel.class,null);
    }

}
