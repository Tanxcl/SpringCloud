package com.orange.business.service.serviceImpl;

import com.orange.business.entity.LoginUser;
import com.orange.business.entity.ResponseResult;
import com.orange.business.entity.User;
import com.orange.business.service.LoginService;
import com.orange.business.utils.JwtUtil;
import com.orange.business.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @className: LoginServiceImpl
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/15 16:15
 **/
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisCache redisCache;

    @Override
    public ResponseResult login(User user) {
        //通过UsernamePasswordAuthenticationToken获取用户名和密码
        UsernamePasswordAuthenticationToken authenticationToken=new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword());

        //AuthenticationManager委托机制对authenticationToken 进行用户认证
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

        //如果认证没有通过，给出对应的提示
        if (Objects.isNull(authenticate)){
            throw new RuntimeException("登录失败");
        }

        //如果认证通过，使用user生成jwt  jwt存入ResponseResult 返回

        //如果认证通过，拿到这个当前登录用户信息
        LoginUser loginUser = (LoginUser) authenticate.getPrincipal();

        //获取当前用户的userid
        String userid = loginUser.getUser().getId().toString();

        String jwt = JwtUtil.createJWT(userid);
        Map<String, String> map = new HashMap<>();
        map.put("token",jwt);

        //把完整的用户信息存入redis  userid为key   用户信息为value
//        redisCache.setCacheObject("login:"+userid,loginUser);
//
//        System.out.println("redis缓存："+(String)redisCache.getCacheObject("login:"+userid));

        return new ResponseResult(200,"登录成功",map);
    }

    @Override
    public ResponseResult logout() {
        //从SecurityContextHolder中的userid
        UsernamePasswordAuthenticationToken authentication =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        Long userid = loginUser.getUser().getId();

        //根据userid找到redis对应值进行删除
        redisCache.deleteObject("login:"+userid);
        return new ResponseResult(200,"注销成功");
    }
}
