package com.weixiaoyi.vo.req;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName TestBindVo
 * @Description TODO
 * @Author xxx
 * History:
 * 版本号   作者     日期      操作
 * 1.0     ylWei   2019/7/18   新建
 */
@Data
public class TestBindVo implements Serializable {

    private static final long serialVersionUID = 71098698877493603L;

    private String userName;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:SS")
    private Date biethday;

}
