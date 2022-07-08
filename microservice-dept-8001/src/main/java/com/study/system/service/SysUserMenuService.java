package com.study.system.service;

import com.study.common.utils.Result;
import com.study.system.entity.SysUserMenu;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
public interface SysUserMenuService extends IService<SysUserMenu> {

    /* 新增用户对应菜单 */
    Result addUserMenu();

    /* 删除用户对应菜单 */
    Result delUserMenu();

    /* 查询用户对应菜单 */
    Result queryUserMenu();

    /* 修改用户对应菜单 */
    Result updateUserMenu();

}
