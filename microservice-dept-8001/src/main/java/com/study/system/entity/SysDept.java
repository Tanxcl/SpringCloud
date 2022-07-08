package com.study.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
@TableName("sys_dept")
public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 部门编号(部门首字母+随机数字)
     */
    @TableField("number")
    private String number;

    /**
     * 父级部门id
     */
    @TableField("parent_id")
    private String parentId;

    /**
     * 部门名称
     */
    @TableField("name")
    private String name;

    /**
     * 部门人员
     */
    @TableField("user")
    private String user;

    /**
     * 部门创建时间
     */
    @TableField("create_time")
    private String createTime;

    /**
     * 部门描述
     */
    @TableField("describe")
    private String describe;

    /**
     * 部门状态(1: 启用、0: 关闭)
     */
    @TableField("state")
    private Integer state;

    /**
     * 部门创建人
     */
    @TableField("create_user")
    private String createUser;

    /**
     * 部门负责人
     */
    @TableField("leader")
    private String leader;

    /**
     * 部门负责人联系电话
     */
    @TableField("leader_phone")
    private String leaderPhone;

    /**
     * 部门负责人邮箱
     */
    @TableField("leader_email")
    private String leaderEmail;

    /**
     * 是否删除(1: 是、0: 否)
     */
    @TableField("is_del")
    @TableLogic
    private Integer isDel;


}
