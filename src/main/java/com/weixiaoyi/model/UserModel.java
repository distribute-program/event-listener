package com.weixiaoyi.model;

import com.weixiaoyi.annotations.ExportTitle;
import com.weixiaoyi.annotations.ExportTitle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName UserModel.java
 * @Description
 * @createTime 2020年06月16日 19:38:00
 * @updateBy
 * @updateTime
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ExportTitle(value = "用户导出", width = 600)
public class UserModel implements Serializable {

    private static final long serialVersionUID = -4784797805868829693L;

    @ExportTitle(value = "用户名")
    private String userName;

    @ExportTitle(value = "年龄")
    private Integer age;

    @ExportTitle(value = "用户地址啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊", width = 50)
    private String address;

    @ExportTitle(value = "用户电话")
    private String telephone;

}
