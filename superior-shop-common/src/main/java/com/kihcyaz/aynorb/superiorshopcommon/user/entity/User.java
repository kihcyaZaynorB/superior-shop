package com.kihcyaz.aynorb.superiorshopcommon.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "user对象", description = "用户实体类")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id", name = "Id", required = true, dataType = "Long")
    private Long id;

    @ApiModelProperty(value = "用户名", name = "username", required = true, dataType = "String")
    private String username;

    @ApiModelProperty(value = "密码，加密存储", name = "password", required = true, dataType = "String")
    private String password;

    @ApiModelProperty(value = "注册手机号", name = "phone", dataType = "String")
    private String phone;

    @ApiModelProperty(value = "注册邮箱", name = "email", dataType = "String")
    private String email;

    @ApiModelProperty(value = "创建时间", name = "created", required = true, dataType = "Date")
    private Date created;

    @ApiModelProperty(value = "更新时间", name = "updated", required = true, dataType = "Date")
    private Date updated;

    /**
     * 会员来源：1:PC，2：H5，3：Android，4：IOS，5：WeChat
     */
    @ApiModelProperty(value = "会员来源", name = "sourceType", dataType = "String")
    private String sourceType;

    @ApiModelProperty(value = "昵称", name = "nickName", dataType = "String")
    private String nickName;

    @ApiModelProperty(value = "真实姓名", name = "name", dataType = "String")
    private String name;

    @ApiModelProperty(value = "使用状态", name = "status", dataType = "String")
    private String status;

    @ApiModelProperty(value = "头像地址", name = "headPic", dataType = "String")
    private String headPic;

    @ApiModelProperty(value = "QQ号码", name = "qq", dataType = "String")
    private String qq;

    @ApiModelProperty(value = "账户余额", name = "accountBalance", dataType = "Long")
    private Long accountBalance;

    @ApiModelProperty(value = "手机是否验证", name = "isMobileCheck", dataType = "String")
    private String mobileCheck;

    @ApiModelProperty(value = "邮箱是否检测", name = "isEmailCheck", dataType = "String")
    private String emailCheck;

    @ApiModelProperty(value = "性别", name = "sex", dataType = "String")
    private String sex;

    @ApiModelProperty(value = "会员等级", name = "userLevel", dataType = "Integer")
    private Integer userLevel;

    @ApiModelProperty(value = "积分", name = "points", dataType = "Integer")
    private Integer points;

    @ApiModelProperty(value = "经验值", name = "experienceValue", dataType = "Integer")
    private Integer experienceValue;

    @ApiModelProperty(value = "生日", name = "birthday", dataType = "Date")
    private Date birthday;

    @ApiModelProperty(value = "最后登录时间", name = "lastLoginTime", dataType = "Date")
    private Date lastLoginTime;
}
