package com.weixiaoyi.util;

import cn.hutool.core.annotation.AnnotationUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.weixiaoyi.annotations.ExportTitle;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.util.StringUtils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName ExportUtils.java
 * @Description 导出excle工具类
 * @createTime 2020年06月22日 16:40:00
 * @updateBy
 * @updateTime
 */
@Slf4j
public class ExportUtils {

    public static void exportXlsx(HttpServletResponse response, List exportModels, Class clazz, String fileName) throws IOException {
        String classTitle = AnnotationUtil.getAnnotationValue(clazz, ExportTitle.class);
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        if (StringUtils.isEmpty(fileName)) {
            String fileName1 = URLEncoder.encode(classTitle, "UTF-8");
            response.setHeader("Content-Disposition","attachment;filename=" + fileName1 + ".xlsx");
        }else {
            String fileName1 = URLEncoder.encode(fileName, "UTF-8");
            response.setHeader("Content-Disposition","attachment;filename=" + fileName1 + ".xlsx");
        }

        ExcelWriter writer = ExcelUtil.getWriter(true);
        ServletOutputStream outputStream = response.getOutputStream();

        CellStyle headCellStyle = writer.getHeadCellStyle();
        Font font = writer.createFont();
        font.setFontHeightInPoints((short) 14);
        font.setBold(true);

        headCellStyle.setFont(font);

        // 设置列标题别名  设置自定义列宽度
        Field[] fields = clazz.getDeclaredFields();
        int i = -1;
        for (Field field : fields) {
            if (!"serialVersionUID".equals(field.getName())) {
                ++i;
                String title = AnnotationUtil.getAnnotationValue(field, ExportTitle.class, "value");
                Integer width = AnnotationUtil.getAnnotationValue(field, ExportTitle.class, "width");
                writer.addHeaderAlias(field.getName(), title);
                log.info("字段属性为：{}， 标题为:{}， 宽度：{}", field.getName(), title, width);
                if (width != 0) {
                    writer.setColumnWidth(i,width);
                }
            }
        }

        // 合并标题单元格 写出列内容
        writer.merge(i, classTitle);
        // 一次性写出内容，使用默认样式，强制输出标题
        writer.write(exportModels, true);
        // 列数据完全写出后设置列高度
        writer.setRowHeight(0,25);
        writer.setRowHeight(1,20);

        // 设置未自定义列自动调整宽度
        int j = 0;
        for (Field field : fields) {
            if (!"serialVersionUID".equals(field.getName())) {
                j++;
                Integer width = AnnotationUtil.getAnnotationValue(field, ExportTitle.class, "width");
                if (width == 0) {
                    writer.autoSizeColumn(j);
                }
            }
        }
        // 流写出资源文件
        writer.flush(outputStream, true);
        writer.close();
        IoUtil.close(outputStream);
    }

}
