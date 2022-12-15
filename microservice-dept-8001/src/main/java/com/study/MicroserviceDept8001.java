package com.study;

import com.study.common.config.FilterTwo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @className: MicroserviceDept8001
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/7/1 23:06
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.study.system.mapper")
@ServletComponentScan
public class MicroserviceDept8001 {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDept8001.class, args);
    }

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new FilterTwo());
        //bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
        bean.addUrlPatterns("/sysDept/*");
        return bean;
    }

}
