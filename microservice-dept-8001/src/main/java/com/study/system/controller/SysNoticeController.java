package com.study.system.controller;


import com.study.common.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  公告管理
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
@Controller
@RequestMapping("/sysNotice")
public class SysNoticeController {

    /* 新增公告 */
    @ResponseBody
    @RequestMapping("/addNotice")
    public Result addNotice(){

        return Result.success("");
    }

    /* 删除公告 */
    @ResponseBody
    @RequestMapping("/delNotice")
    public Result delNotice(){

        return Result.success("");
    }

    /* 查询公告 */
    @ResponseBody
    @RequestMapping("/queryNotice")
    public Result queryNotice(){

        return Result.success("");
    }

    /* 修改公告 */
    @ResponseBody
    @RequestMapping("/updateNotice")
    public Result updateNotice(){

        return Result.success("");
    }

}

