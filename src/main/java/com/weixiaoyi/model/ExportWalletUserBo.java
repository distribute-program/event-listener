package com.weixiaoyi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.weixiaoyi.annotations.ExportTitle;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName WalletUserPageVo.java
 * @Description 运营平台-结算管理（用户列表）导出实体类
 * @createTime 2020年06月20日 11:05:00
 * @updateBy
 * @updateTime
 */
@Data
@ExportTitle(value = "账户管理", width = 600)
public class ExportWalletUserBo implements Serializable {

    private static final long serialVersionUID = 6839200792605323710L;

    @ExportTitle(value = "用户名称", width = 15)
    private String userName;

    @ExportTitle(value = "用户电话")
    private String cellPhone;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ExportTitle(value = "创建时间")
    private Date createTime;

    @ExportTitle(value = "创建时间2")
    private String createTime2;

    @ExportTitle(value = "用户状态")
    private String userStatus;

    @ExportTitle(value = "可用余额")
    private BigDecimal balanceAmount;

}
