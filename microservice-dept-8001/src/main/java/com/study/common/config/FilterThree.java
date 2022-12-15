package com.study.common.config;

import ch.qos.logback.classic.ViewStatusMessagesServlet;
import com.study.common.utils.IpUtil;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @className: FilterThree
 * @description: TODO 过滤器实现方式
 * @author: Txc
 * @date: 2022/12/14 22:53
 **/
@Component
public class FilterThree implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化FilterThree");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入FilterThree");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开FilterThree");
    }

    @Override
    public void destroy() {
        System.out.println("销毁FilterThree");
    }
}
