package com.study.system.service.serviceImpl;

import com.study.common.utils.Result;
import com.study.system.entity.SysMenu;
import com.study.system.mapper.SysMenuMapper;
import com.study.system.service.SysMenuService;
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
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    private static final Logger logger = LoggerFactory.getLogger(SysMenuServiceImpl.class);

    @Override
    public Result addMenu() {
        return null;
    }

    @Override
    public Result delMenu() {
        return null;
    }

    @Override
    public Result queryMenu() {
        return null;
    }

    @Override
    public Result updateMenu() {
        return null;
    }
}
