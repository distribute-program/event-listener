package com.weixiaoyi.vo.resp;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ResultVo
 * @Description 控制层返回结果封装类
 * @Author xxx
 * History:
 * 版本号   作者     日期      操作
 * 1.0     ylWei   2019/7/18   新建
 */
@Data
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = 7884474114073844133L;

    private String code;

    private String desc;

    private T data;

}
