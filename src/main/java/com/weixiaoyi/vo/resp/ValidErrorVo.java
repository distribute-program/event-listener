package com.weixiaoyi.vo.resp;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ValidErrorVo
 * @Description 参数校验错误返回结果封装类
 * @Author xxx
 * History:
 * 版本号   作者     日期      操作
 * 1.0     ylWei   2019/7/18   新建
 */
@Data
public class ValidErrorVo implements Serializable {

    private static final long serialVersionUID = -5308551766917329786L;

    private String field;

    private String errorMessage;

}
