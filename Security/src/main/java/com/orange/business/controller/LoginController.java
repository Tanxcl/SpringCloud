package com.orange.business.controller;

import com.orange.business.entity.ResponseResult;
import com.orange.business.entity.User;
import com.orange.business.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.expression.SecurityExpressionRoot;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @className: LoginController
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/15 16:11
 **/
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody(required = false) User user){
        System.out.println("login");
        return loginService.login(user);
    }

    @PostMapping("/user/logout")
//    @PreAuthorize()
    public ResponseResult logout(){
        return loginService.logout();
//        UsernamePasswordAuthenticationFilter;
//        Authentication;
//        AuthenticationManager;
//        ProviderManager;
//        DaoAuthenticationProvider;
//        UsernamePasswordAuthenticationToken;
//        DispatcherServlet
    }


    @PostMapping("/user/test")
    public ResponseResult test(){
        return null;
//        UsernamePasswordAuthenticationFilter;
//        Authentication;
//        AuthenticationManager;
//        ProviderManager;
//        DaoAuthenticationProvider;
//        UsernamePasswordAuthenticationToken;
//        DispatcherServlet

//        InterceptorRegistry;
//        HandlerInterceptor;
//        SecurityExpressionRoot;
        ConcurrentHashMap;
        Object;
        ReentrantLock;
        Thread;
        Runnable;

    }

}
