package com.study.system.controller;


import com.study.common.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  数据字典管理
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
@Controller
@RequestMapping("/sysDict")
public class SysDictController {

    /* 新增数据字典 */
    @ResponseBody
    @RequestMapping("/addDict")
    public Result addDict(){

        return Result.success("");
    }

    /* 删除数据字典 */
    @ResponseBody
    @RequestMapping("/delDict")
    public Result delDict(){

        return Result.success("");
    }

    /* 查询数据字典 */
    @ResponseBody
    @RequestMapping("/queryDict")
    public Result queryDict(){

        return Result.success("");
    }

    /* 修改数据字典 */
    @ResponseBody
    @RequestMapping("/updateDict")
    public Result updateDict(){

        return Result.success("");
    }

}

