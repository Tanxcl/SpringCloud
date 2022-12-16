package com.study.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @className: WebConfig
 * @description: TODO 使用LoginInterceptor拦截的请求
 * @author: Txc
 * @date: 2022/12/15 14:42
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/sysUser/**").excludePathPatterns("/loginjudge","/","/retolo","/static/**");
    }
}
