package com.study.common.config;

import javax.servlet.*;
import java.io.IOException;

/**
 * @className: FirstFilter
 * @description: TODO 过滤器实现方式
 * @author: Txc
 * @date: 2022/12/14 22:49
 **/
public class FilterTwo implements Filter {
    /**
     *     @Bean
     *     public FilterRegistrationBean getFilterRegistrationBean(){
     *         FilterRegistrationBean bean = new FilterRegistrationBean(new FilterTwo());
     *         //bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
     *         bean.addUrlPatterns("/sysDept/*");   //过滤的路径
     *         return bean;
     *     }
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化FilterTwo");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入FilterTwo");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开FilterTwo");
    }

    @Override
    public void destroy() {
        System.out.println("销毁FilterTwo");
    }
}
