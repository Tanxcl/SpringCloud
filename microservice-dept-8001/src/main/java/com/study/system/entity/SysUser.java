package com.study.system.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @TableField("name")
    private String name;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 性别(1: 男、0: 女)
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 年龄
     */
    @TableField("age")
    private Integer age;

    /**
     * 身份证
     */
    @TableField("id_card")
    private String idCard;

    /**
     * 手机号
     */
    @TableField("phone")
    private String phone;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 住址
     */
    @TableField("address")
    private String address;

    /**
     * 所属部门
     */
    @TableField("dept_id")
    private String deptId;

    /**
     * 最后一次登录的时间
     */
    @TableField("login_time")
    private String loginTime;

    /**
     * 头像
     */
    @TableField("head_sculpture")
    private String headSculpture;

    /**
     * 用户状态(1: 启用、0: 禁用)
     */
    @TableField("state")
    private Integer state;

    /**
     * 是否删除(1: 未删除、0: 已删除)
     */
    @TableField("is_del")
    @TableLogic
    private Integer isDel;


}
