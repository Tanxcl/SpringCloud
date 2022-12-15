package com.study.system.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.system.entity.SysDept;
import com.study.system.entity.SysRole;
import com.study.system.entity.SysUser;


import com.study.system.mapper.SysDeptMapper;
import com.study.system.mapper.SysRoleMapper;
import com.study.system.mapper.SysUserMapper;
import com.study.system.service.SysUserService;
import com.study.common.utils.DateUtil;
import com.study.common.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

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

    private static final Logger logger = LoggerFactory.getLogger(SysUserServiceImpl.class);

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    public Result login(SysUser sysUser) {
/*

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
        QueryWrapper<SysRole> qwRole = new QueryWrapper<>();
        qwRole.eq("user_id", user.getId());
        List<SysRole> sysRoles = sysRoleMapper.selectList(qwRole);

        //获取权限菜单

        //获取部门信息
        QueryWrapper<SysDept> qwDept = new QueryWrapper<>();
        qwDept.eq("id", user.getDeptId());
        List<SysDept> sysDepts = sysDeptMapper.selectList(qwDept);

        //记录日志

        //更新当前登录时间
        UpdateWrapper<Object> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", user.getId())
                .set("login_time", DateUtil.getCurrentDateTwo());

        //响应到前端的数据
        HashMap<String, Object> map = new HashMap<>();
*/

        return Result.success("登录成功!");
    }

    @Override
    public Result checkOut(SysUser sysUser) {
        return null;
    }

    @Override
    public Result addUser(SysUser sysUser) {

        /*//判断用户信息是否符合录入要求

        if (sysUserMapper.insert(sysUser) != 1){
            return Result.error("新增用户失败!");
        }*/
        return Result.success("成功新增用户!");
    }

    @Override
    public Result delUser(SysUser sysUser) {

        /*//查询用户是否存在
        if (judgeUser(sysUser.getId())){
            return Result.error("用户不存在，删除用户失败!!!");
        }

        //逻辑删除修改is_del
        UpdateWrapper<SysUser> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", sysUser.getId())
                .set("is_del", "1");
        int update = sysUserMapper.update(null, updateWrapper);
*/
        return Result.success("成功删除用户信息!");
    }

    @Override
    public Result queryUser(SysUser sysUser) {
        //判断查询条件
        /*List<SysUser> list = sysUserMapper.selectList(null);*/
        /*return Result.success("", list);*/
        return Result.success("");
    }

    @Override
    public Result updateUser(SysUser sysUser) {
        return null;
    }

    @Override
    public Result resetPassword(SysUser sysUser) {

        //查询用户是否存在
//        if (judgeUser(sysUser.getId())){
//            return Result.error("用户不存在，设置密码!!!");
//        }
        //修改密码
        /*UpdateWrapper<SysUser> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", sysUser.getId())
                .set("password", sysUser.getPassword());
        int update = sysUserMapper.update(null, updateWrapper);
        if (update == 1){
            return Result.error("重置密码失败!!!");
        }*/
        return null;
    }

    @Override
    public Result setPassword(SysUser sysUser) {

        //查询用户是否存在
        /*if (judgeUser(sysUser.getId())){
            return Result.error("用户不存在，设置密码!!!");
        }
        //修改密码
        UpdateWrapper<SysUser> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", sysUser.getId())
                .set("password", sysUser.getPassword());
        int update = sysUserMapper.update(null, updateWrapper);
        if (update == 1){
            return Result.error("设置密码失败!!!");
        }*/
        return null;
    }

    //查询用户是否存在
    public boolean judgeUser(int userId){
        /*QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", userId)
                .eq("is_del", "0");
        SysUser user = sysUserMapper.selectOne(queryWrapper);
        if (user == null){
            return true;
        }*/
        return false;
    }
}
