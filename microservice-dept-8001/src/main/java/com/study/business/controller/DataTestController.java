package com.study.business.controller;

import com.study.business.entity.DataTest;
import com.study.business.mapper.DataTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

/**
 * @className: DataTestController
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/17 17:55
 **/
@Controller
public class DataTestController {

    @Autowired
    private DataTestMapper dataTestMapper;

    @RequestMapping("/dataTest")
    public String addData(){
        try{
            System.out.println("xxxxx");
        }catch (Exception e){
            e.printStackTrace();
            return "插入数据失败";
        }

        return "插入数据完成";
    }

}
