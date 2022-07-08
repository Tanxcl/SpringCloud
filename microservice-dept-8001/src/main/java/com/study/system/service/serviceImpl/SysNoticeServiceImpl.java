package com.study.system.service.serviceImpl;

import com.study.common.utils.Result;
import com.study.system.entity.SysNotice;
import com.study.system.mapper.SysNoticeMapper;
import com.study.system.service.SysNoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class SysNoticeServiceImpl extends ServiceImpl<SysNoticeMapper, SysNotice> implements SysNoticeService {

    @Override
    public Result addNotice() {
        return null;
    }

    @Override
    public Result delNotice() {
        return null;
    }

    @Override
    public Result queryNotice() {
        return null;
    }

    @Override
    public Result updateNotice() {
        return null;
    }
}
