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
@TableName("sys_role")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId("id")
    private Integer id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 用户类型
     */
    @TableField("user_type")
    private String userType;

    /**
     * 权限等级
     */
    @TableField("level")
    private String level;

    /**
     * 是否删除(1: 是、0: 否)
     */
    @TableField("is_del")
    @TableLogic
    private Integer isDel;


}
