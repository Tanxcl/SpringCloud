package com.study.common.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @className: TestFilter
 * @description: TODO 过滤器实现方式
 * @author: Txc
 * @date: 2022/12/14 22:42
 **/
@WebFilter(filterName="FirstFilter",urlPatterns="/sysDept/*")   //filterName:过滤器名称  urlPatterns:需要过滤的映射路径
public class FilterOne implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化FilterOne");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入FilterOne");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开FilterOne");
    }

    @Override
    public void destroy() {
        System.out.println("销毁FilterOne");
    }
}
