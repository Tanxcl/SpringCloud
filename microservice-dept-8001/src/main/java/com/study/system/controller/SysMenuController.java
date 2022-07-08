package com.study.system.controller;


import com.study.common.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  菜单管理
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
@Controller
@RequestMapping("/sysMenu")
public class SysMenuController {

    /* 新增菜单 */
    @ResponseBody
    @RequestMapping("/addMenu")
    public Result addMenu(){

        return Result.success("");
    }

    /* 删除菜单 */
    @ResponseBody
    @RequestMapping("/delMenu")
    public Result delMenu(){

        return Result.success("");
    }

    /* 查询菜单 */
    @ResponseBody
    @RequestMapping("/queryMenu")
    public Result queryMenu(){

        return Result.success("");
    }

    /* 修改菜单 */
    @ResponseBody
    @RequestMapping("/updateMenu")
    public Result updateMenu(){

        return Result.success("");
    }

}

