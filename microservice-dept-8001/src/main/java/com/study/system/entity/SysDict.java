package com.study.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
@TableName("sys_dict")
public class SysDict extends Page implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId("id")
    private Integer id;

    /**
     * 类型编号
     */
    @TableField("type_id")
    private String typeId;

    /**
     * 类型名称
     */
    @TableField("type_name")
    private String typeName;

    /**
     * 字段编号
     */
    @TableField("code_type")
    private String codeType;

    /**
     * 字段名称
     */
    @TableField("code_name")
    private String codeName;

    /**
     * 序号
     */
    @TableField("seqno")
    private Integer seqno;

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


}
