package com.study.system.controller;


import com.study.common.utils.IpUtil;
import com.study.common.utils.RedisUtil;
import com.study.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  部门管理
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
@Controller
@RequestMapping("/sysDept")
public class SysDeptController {

    @Autowired
    private RedisUtil redisUtil;

    /* 新增部门 */
    @ResponseBody
    @RequestMapping("/addDept")
    public Result addDept(){
//        redisUtil.set("name", "txc");
//        System.out.println(redisUtil.get("name"));
        int a = 10;
        for (int i = 0; i < 10; i++) {
            c:for (int i1 = 0; i1 < 3; i1++) {
                break c;
            }
        }
        delDept();
        System.out.println("1111");
        return Result.success("新增部门");
    }

    /* 删除部门 */
    @ResponseBody
    @RequestMapping("/delDept")
    public Result delDept(){
        System.out.println("22222");
        return Result.success("");
    }

    /* 查询部门 */
    @ResponseBody
    @RequestMapping("/queryDept")
    public Result queryDept(){

        return Result.success("");
    }

    /* 修改部门 */
    @ResponseBody
    @RequestMapping("/updateDept")
    public Result updateDept(){

        return Result.success("");
    }

}

