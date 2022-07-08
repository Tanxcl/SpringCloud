package com.study.system.controller;


import com.study.common.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  角色管理
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
@Controller
@RequestMapping("/sysRole")
public class SysRoleController {

    /* 新增角色 */
    @ResponseBody
    @RequestMapping("/addRole")
    public Result addRole(){

        return Result.success("");
    }

    /* 删除角色 */
    @ResponseBody
    @RequestMapping("/delRole")
    public Result delRole(){

        return Result.success("");
    }

    /* 查询角色 */
    @ResponseBody
    @RequestMapping("/queryRole")
    public Result queryRole(){

        return Result.success("");
    }

    /* 修改角色 */
    @ResponseBody
    @RequestMapping("/updateRole")
    public Result updateRole(){

        return Result.success("");
    }

}

