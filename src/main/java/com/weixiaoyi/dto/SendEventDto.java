package com.weixiaoyi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 15:40
 * @description：发布事件请求封装类
 * @modified By：
 * @version: 1.0
 */
@Data
@ToString
@AllArgsConstructor
public class SendEventDto implements Serializable {

    private static final long serialVersionUID = -7586157376031072118L;

    /** 发送内容 */
    private String sendName;

}
