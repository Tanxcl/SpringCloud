package com.study.system.controller;


import com.study.common.utils.Result;
import com.study.common.utils.StatusCode;
import com.study.system.entity.SysUser;
import com.study.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  用户管理
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-08
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /* 登录 */
    @ResponseBody
    @RequestMapping("/login")
    public Result login(@RequestBody SysUser sysUser){

        Result result = sysUserService.login(sysUser);

        return Result.success("", "");
    }

    /* 退出 */
    @ResponseBody
    @RequestMapping("/checkOut")
    public Result checkOut(@RequestBody SysUser sysUser){

        Result result = sysUserService.checkOut(sysUser);
        return Result.success("", "");
    }

    /* 新增用户信息 */
    @ResponseBody
    @RequestMapping("/addUser")
    public Result addUser(@RequestBody SysUser sysUser){

//        Result result = sysUserService.addUser(sysUser);
        return Result.success("", "");
    }

    /* 删除用户信息 */
    @ResponseBody
    @RequestMapping("/delUser")
    public Result delUser(@RequestBody SysUser sysUser){

//        Result result = sysUserService.delUser(sysUser);
        return Result.success("", "");
    }

    /* 查询用户信息 */
    @ResponseBody
    @RequestMapping("/queryUser")
    public Result queryUser(){

//        Result result = sysUserService.queryUser(new SysUser());
//        List<SysUser> list = sysUserService.list(null);
//        for (SysUser user : list) {
//            System.out.println(user.toString());
//        }
        return Result.success("", "");
    }

    /* 修改用户信息 */
    @ResponseBody
    @RequestMapping("/updateUser")
    public Result updateUser(@RequestBody SysUser sysUser){

//        Result result = sysUserService.updateUser(sysUser);
        return Result.success("", "");
    }

    /* 重置用户密码 */
    @ResponseBody
    @RequestMapping("/resetPassword")
    public Result resetPassword(@RequestBody SysUser sysUser){

//        Result result = sysUserService.resetPassword(sysUser);
        return Result.success("", "");
    }

    /* 设置用户密码 */
    @ResponseBody
    @RequestMapping("/setPassword")
    public Result setPassword(@RequestBody SysUser sysUser){

//        Result result = sysUserService.setPassword(sysUser);
        return Result.success("", "");
    }


}

