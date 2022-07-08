package com.study.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("sys_log")
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;

    /**
     * 操作时间
     */
    @TableField("operater_date")
    private String operaterDate;

    /**
     * 操作类型
     */
    @TableField("operater_type")
    private String operaterType;

    /**
     * 日志类型(1: 操作日志、2: 异常日志)
     */
    @TableField("log_type")
    private Integer logType;

    /**
     * 操作日志-模块名称-异常日志-方法名称
     */
    @TableField("module")
    private String module;

    /**
     * 请求路径
     */
    @TableField("url")
    private String url;

    /**
     * 描述
     */
    @TableField("description")
    private String description;


}
