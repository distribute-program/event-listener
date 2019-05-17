package com.weixiaoyi.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/15 10:00
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RestVo implements Serializable {

    private static final long serialVersionUID = 7836800515158766758L;

    private String restName;

    private String restDesc;

}
