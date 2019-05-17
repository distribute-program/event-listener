package com.weixiaoyi.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 10:52
 * @description：swagger初始化参数
 * @modified By：
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "weixiaoyi.doc")
@Component
@Data
public class DocConfigProperties {

    /** project name */
    private String apiName;

    /** document description */
    private String description;

    /** document title */
    private String title;

    /** document author */
    private String author;

    /** document version */
    private String version;

    /** index html */
    private String url;

    /** authpr email */
    private String email;

    /** group name */
    private String groupName;

}
