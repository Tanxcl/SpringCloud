package com.study.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.system.entity.SysUser;
import com.study.common.utils.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-08
 */
public interface SysUserService extends IService<SysUser> {

    /* 登录 */
    Result login(SysUser sysUser);

    /* 退出 */
    Result checkOut(SysUser sysUser);

    /* 新增用户信息 */
    Result addUser(SysUser sysUser);

    /* 删除用户信息 */
    Result delUser(SysUser sysUser);

    /* 查询用户信息 */
    Result queryUser(SysUser sysUser);

    /* 修改用户信息 */
    Result updateUser(SysUser sysUser);

    /* 重置用户密码 */
    Result resetPassword(SysUser sysUser);

    /* 设置用户密码 */
    Result setPassword(SysUser sysUser);

}
