package com.weixiaoyi.vo.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
    @NotBlank(message = "名称不能为空")
    private String xiaoyiName;

    @ApiModelProperty(value = "年龄", name = "xiaoyiAge", dataType = "int", required = true)
    @NotNull(message = "年龄不能为空")
    private Integer xiaoyiAge;

}
