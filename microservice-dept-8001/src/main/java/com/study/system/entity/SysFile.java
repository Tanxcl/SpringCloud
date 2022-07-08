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
@TableName("sys_file")
public class SysFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 上传的文件名
     */
    @TableField("file_original_name")
    private String fileOriginalName;

    /**
     * 新生成的文件名
     */
    @TableField("file_new_name")
    private String fileNewName;

    /**
     * 文件大小
     */
    @TableField("file_size")
    private String fileSize;

    /**
     * 文件类型
     */
    @TableField("file_type")
    private String fileType;

    /**
     * 文件上传路径
     */
    @TableField("path")
    private String path;

    /**
     * 文件上传时间
     */
    @TableField("create_time")
    private String createTime;

    /**
     * 文件上传人
     */
    @TableField("create_user")
    private String createUser;

    /**
     * 是否删除(1: 未删除、0: 已删除)
     */
    @TableField("is_del")
    @TableLogic
    private Integer isDel;

    /**
     * 服务器名称
     */
    @TableField("service_name")
    private String serviceName;

    /**
     * 文件对应模块
     */
    @TableField("module")
    private String module;


}
