package com.weixiaoyi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName ExportTitle.java
 * @Description 导出标题获取注解
 * @createTime 2020年06月16日 19:42:00
 * @updateBy
 * @updateTime
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.TYPE })
public @interface ExportTitle {

    /**
     * 注解的默认属性值
     *
     * @return 标题名
     */
    String value();

    /**
     * 列宽度
     *
     * @return 属性值
     */
    int width() default 0;

}
