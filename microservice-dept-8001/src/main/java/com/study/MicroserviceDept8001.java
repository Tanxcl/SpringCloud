package com.study;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
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
@MapperScan(basePackages = {"com.study.system.mapper","com.study.business.mapper"})
@ServletComponentScan

public class MicroserviceDept8001 {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDept8001.class, args);
    }

    /**
     * 一种拦截器的实现方式
     */
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new FilterTwo());
        //bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
        bean.addUrlPatterns("/sysDept/*");
        return bean;
    }

    /**
     * 拦截器分页
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

}
