package com.study.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("sys_menu")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("id")
    private Integer id;

    /**
     * 菜单编号
     */
    @TableField("code")
    private String code;

    /**
     * 菜单名称
     */
    @TableField("name")
    private String name;

    /**
     * 菜单链接
     */
    @TableField("url")
    private String url;

    /**
     * 父级菜单
     */
    @TableField("parent_id")
    private String parentId;

    /**
     * 父级菜单链接
     */
    @TableField("parent_url")
    private String parentUrl;

    /**
     * 权限类型(1: 菜单、2: 按钮)
     */
    @TableField("type")
    private String type;

    /**
     * 权限等级
     */
    @TableField("level")
    private Integer level;

    /**
     * 是否删除(1: 是、0: 否)
     */
    @TableField("is_del")
    @TableLogic
    private Integer isDel;

    /**
     * 创建时间
     */
    @TableField("creat_time")
    private String creatTime;

    /**
     * 创建人
     */
    @TableField("creat_user")
    private String creatUser;

    /**
     * 备注
     */
    @TableField("remarks")
    private String remarks;


}
