package com.study.system.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.common.utils.Result;
import com.study.system.mapper.SysFileMapper;
import com.study.system.service.SysFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  文件上传下载管理
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
@Controller
@RequestMapping("/sysFile")
public class SysFileController {

    @Autowired
    private SysFileService sysFileService;

    @Autowired
    private SysFileMapper sysFileMapper;

    /* 查询文件 */
    @ResponseBody
    @RequestMapping("/queryFile")
    public Result queryFile(){
        sysFileMapper.selectList(new QueryWrapper<>());
        return Result.success("");
    }

    /* 删除文件 */
    @ResponseBody
    @RequestMapping("/delFile")
    public Result delFile(){

        return Result.success("");
    }

    /* 上传文件 */
    @ResponseBody
    @RequestMapping("/uploadFile")
    public Result uploadFile(){

        return Result.success("");
    }

    /* 下载文件 */
    @ResponseBody
    @RequestMapping("/dowmloadFile")
    public Result dowmloadFile(){

        return Result.success("");
    }

}

