package com.study.common.config;

import com.study.common.utils.TokenUtil;
import com.study.system.entity.SysUser;
import com.study.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @className: LoginInterceptor
 * @description: TODO 登录拦截器
 * @author: Txc
 * @date: 2022/12/15 13:06
 **/
@Component
public class LoginInterceptor  implements HandlerInterceptor {

    @Autowired
    private TokenUtil tokenUtil;

    @Autowired
    private SysUserService sysUserService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        /**
         * 获取前端传入的token，判断是否有token并且是否有效
         *      是：从token中获取user信息，判断是否有UserId
         *          是：通过通过UserId查询数据库，判断是否有这个用户
         *              是：return true
         *              否：直接返回"该用户不存在" return false
         *          否：直接返回"请登录提示" return false
         *      否：直接返回"请登录提示" return false
         */
        System.out.println("拦截器：LoginInterceptor");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
