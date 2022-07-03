package com.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: MicroserviceDept8001
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/7/1 23:06
 **/
@SpringBootApplication
@MapperScan("com.study.dao")
public class MybatisPlus {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlus.class,args);
    }

}
