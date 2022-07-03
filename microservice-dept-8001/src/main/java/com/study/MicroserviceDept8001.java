package com.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @className: MicroserviceDept8001
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/7/1 23:06
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.study.dao")
public class MicroserviceDept8001 {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDept8001.class,args);
    }

}
