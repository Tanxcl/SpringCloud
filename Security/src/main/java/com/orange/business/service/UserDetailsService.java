package com.orange.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.orange.business.entity.User;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @className: UserDetailsService
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/15 16:04
 **/
public interface UserDetailsService {

    UserDetails loadUserByUsername(String username);

}
