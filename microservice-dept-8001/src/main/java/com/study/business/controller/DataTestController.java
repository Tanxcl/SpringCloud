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
//            DataTest dataTest = new DataTest();
//            Random random = new Random();
//            for (int i = 0; i < 1000000; i++) {
//                if (i%3==0){
//                    dataTest.setName("王五"+random.nextInt(i+10));
//                }else if(i%2==0){
//                    dataTest.setName("小白"+random.nextInt(i+10));
//                }else{
//                    dataTest.setName("凶獒黑"+random.nextInt(i+10));
//                }
//                if (i%2==0){
//                    dataTest.setSex("0");
//                }else{
//                    dataTest.setSex("1");
//                }
//                dataTest.setAddress("地址是"+dataTest.getName());
//                dataTest.setPhone("1111111111");
//                dataTest.setDel("0");
//                dataTestMapper.insert(dataTest);
//            }
        }catch (Exception e){
            e.printStackTrace();
            return "插入数据失败";
        }

        return "插入数据完成";
    }

}
