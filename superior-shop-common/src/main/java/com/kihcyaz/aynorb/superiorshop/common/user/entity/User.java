package com.kihcyaz.aynorb.superiorshop.common.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "user对象", description = "用户实体类")
@TableName("tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id", name = "Id", required = true, dataType = "Long")
    @TableId(value = "id", type = IdType.AUTO)
    @TableField("id")
    private Long id;

    @TableField("username")
    @ApiModelProperty(value = "用户名", name = "username", required = true, dataType = "String")
    private String username;

    @ApiModelProperty(value = "密码，加密存储", name = "password", required = true, dataType = "String")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "注册手机号", name = "phone", dataType = "String")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "注册邮箱", name = "email", dataType = "String")
    @TableField("email")
    private String email;

    @ApiModelProperty(value = "创建时间", name = "created", required = true, dataType = "Date")
    @TableField("created")
    private Date created;

    @ApiModelProperty(value = "更新时间", name = "updated", required = true, dataType = "Date")
    @TableField("updated")
    private Date updated;

    /**
     * 会员来源：1:PC，2：H5，3：Android，4：IOS，5：WeChat
     */
    @ApiModelProperty(value = "会员来源", name = "sourceType", dataType = "String")
    @TableField("source_type")
    private String sourceType;

    @ApiModelProperty(value = "昵称", name = "nickName", dataType = "String")
    @TableField("nick_name")
    private String nickName;

    @ApiModelProperty(value = "真实姓名", name = "name", dataType = "String")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "使用状态", name = "status", dataType = "String")
    @TableField("status")
    private String status;

    @ApiModelProperty(value = "头像地址", name = "headPic", dataType = "String")
    @TableField("head_pic")
    private String headPic;

    @ApiModelProperty(value = "QQ号码", name = "qq", dataType = "String")
    @TableField("qq")
    private String qq;

    @ApiModelProperty(value = "账户余额", name = "accountBalance", dataType = "Long")
    @TableField("account_balance")
    private Long accountBalance;

    @ApiModelProperty(value = "手机是否验证", name = "isMobileCheck", dataType = "String")
    @TableField("is_mobile_check")
    private String mobileCheck;

    @ApiModelProperty(value = "邮箱是否检测", name = "isEmailCheck", dataType = "String")
    @TableField("is_email_check")
    private String emailCheck;

    @ApiModelProperty(value = "性别", name = "sex", dataType = "String")
    @TableField("sex")
    private String sex;

    @ApiModelProperty(value = "会员等级", name = "userLevel", dataType = "Integer")
    @TableField("user_level")
    private Integer userLevel;

    @ApiModelProperty(value = "积分", name = "points", dataType = "Integer")
    @TableField("points")
    private Integer points;

    @ApiModelProperty(value = "经验值", name = "experienceValue", dataType = "Integer")
    @TableField("experience_value")
    private Integer experienceValue;

    @ApiModelProperty(value = "生日", name = "birthday", dataType = "Date")
    @TableField("birthday")
    private Date birthday;

    @ApiModelProperty(value = "最后登录时间", name = "lastLoginTime", dataType = "Date")
    @TableField("last_login_time")
    private Date lastLoginTime;
}
