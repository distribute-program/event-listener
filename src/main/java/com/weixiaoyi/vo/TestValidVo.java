package com.weixiaoyi.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.PropertySource;

import java.io.Serializable;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 10:14
 * @description：测试参数校验封装实体
 * @modified By：
 * @version: 1.0
 */
@Data
@ToString
public class TestValidVo implements Serializable {

    private static final long serialVersionUID = 4976454919479064224L;

    @ApiModelProperty(value = "名称", name = "xiaoyiName", dataType = "String", required = true)
    private String xiaoyiName;

    @ApiModelProperty(value = "名称", name = "xiaoyiName", dataType = "String", required = true)
    private Integer xiaoyiAge;

}
