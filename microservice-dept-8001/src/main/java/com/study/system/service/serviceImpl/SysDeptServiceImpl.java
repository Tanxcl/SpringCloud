package com.study.system.service.serviceImpl;

import com.study.common.utils.Result;
import com.study.system.entity.SysDept;
import com.study.system.mapper.SysDeptMapper;
import com.study.system.service.SysDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
public class SysDeptServiceImpl implements SysDeptService {

    private static final Logger logger = LoggerFactory.getLogger(SysDeptServiceImpl.class);

    @Autowired
    private SysDeptService sysDeptService;

    @Override
    public Result addDept() {
        return null;
    }

    @Override
    public Result delDept() {
        return null;
    }

    @Override
    public Result queryDept() {
        return null;
    }

    @Override
    public Result updateDept() {
        return null;
    }
}
