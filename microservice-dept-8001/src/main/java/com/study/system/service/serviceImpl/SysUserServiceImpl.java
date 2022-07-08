package com.study.system.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.system.entity.SysUser;


import com.study.system.mapper.SysUserMapper;
import com.study.system.service.SysUserService;
import com.study.common.utils.DateUtil;
import com.study.common.utils.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-08
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;



    @Override
    public Result login(SysUser sysUser) {

        //短信验证

        //单点登录

        String name = sysUser.getName();
        String password = sysUser.getPassword();
        //判断用户名和密码是否为空
        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password)){
            return  Result.error("用户名或密码为空!");
        }
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        queryWrapper.eq("password", password);
        queryWrapper.eq("is_del", "1");
        SysUser user = sysUserMapper.selectOne(queryWrapper);
        if (user == null){
            return Result.error("不存在该用户,或密码错误!");
        }

        //获取角色信息


        //获取权限菜单

        //获取部门信息

        //记录日志

        //更新当前登录时间
        UpdateWrapper<Object> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", user.getId())
                .set("login_time", DateUtil.getCurrentDate());

        return Result.success("登录成功!");
    }

    @Override
    public Result checkOut(SysUser sysUser) {
        return null;
    }

    @Override
    public Result addUser(SysUser sysUser) {

        //判断用户信息是否符合录入要求

        if (sysUserMapper.insert(sysUser) != 1){
            return Result.error("新增用户失败!");
        }
        return Result.success("成功新增用户!");
    }

    @Override
    public Result delUser(SysUser sysUser) {

        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", sysUser.getName());
        queryWrapper.eq("password", sysUser.getPassword());
        queryWrapper.eq("is_del", "1");
        SysUser user = sysUserMapper.selectOne(queryWrapper);
        if (user == null){
            return Result.error("!");
        }
        //逻辑删除修改is_del
        UpdateWrapper<SysUser> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", user.getId())
                .set("is_del", "0");
        int update = sysUserMapper.update(null, updateWrapper);

        return Result.success("成功删除用户信息!");
    }

    @Override
    public Result queryUser(SysUser sysUser) {
        //判断查询条件

        return null;
    }

    @Override
    public Result updateUser(SysUser sysUser) {
        return null;
    }

    @Override
    public Result resetPassword(SysUser sysUser) {

        //查询用户是否存在

        //修改密码

        return null;
    }

    @Override
    public Result setPassword(SysUser sysUser) {

        //查询用户是否存在

        //修改密码

        return null;
    }
}
