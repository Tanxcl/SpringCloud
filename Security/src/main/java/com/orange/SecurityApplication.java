package com.orange;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: SecurityApplication
 * @description: TODO 主启动类
 * @author: Txc
 * @date: 2022/12/15 15:51
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.orange.business.mapper")
public class SecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }
}
