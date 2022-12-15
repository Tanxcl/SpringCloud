package com.study.system.service.serviceImpl;

import com.study.common.utils.Result;
import com.study.system.entity.SysRole;
import com.study.system.mapper.SysRoleMapper;
import com.study.system.service.SysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Orange_Code
 * @since 2022-07-09
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    private static final Logger logger = LoggerFactory.getLogger(SysRoleServiceImpl.class);

    @Override
    public Result addRole() {
        return null;
    }

    @Override
    public Result delRole() {
        return null;
    }

    @Override
    public Result queryRole() {
        return null;
    }

    @Override
    public Result updateRole() {
        return null;
    }
}
