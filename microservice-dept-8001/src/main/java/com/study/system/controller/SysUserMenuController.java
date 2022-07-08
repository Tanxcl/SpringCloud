package com.study.system.controller;


import com.study.common.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  用户对应菜单管理
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
@Controller
@RequestMapping("/sysUserMenu")
public class SysUserMenuController {

    /* 新增用户对应菜单 */
    @ResponseBody
    @RequestMapping("/addUserMenu")
    public Result addUserMenu(){

        return Result.success("");
    }

    /* 删除用户对应菜单 */
    @ResponseBody
    @RequestMapping("/delUserMenu")
    public Result delUserMenu(){

        return Result.success("");
    }

    /* 查询用户对应菜单 */
    @ResponseBody
    @RequestMapping("/queryUserMenu")
    public Result queryUserMenu(){

        return Result.success("");
    }

    /* 修改用户对应菜单 */
    @ResponseBody
    @RequestMapping("/updateUserMenu")
    public Result updateUserMenu(){

        return Result.success("");
    }


}

