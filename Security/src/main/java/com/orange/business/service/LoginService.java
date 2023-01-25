package com.orange.business.service;

import com.orange.business.entity.ResponseResult;
import com.orange.business.entity.User;

/**
 * @className: LoginService
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/15 16:14
 **/
public interface LoginService {

    ResponseResult login(User user);

    ResponseResult logout();

}
