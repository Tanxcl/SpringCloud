package com.study.system.service.serviceImpl;

import com.study.system.entity.SysFile;
import com.study.system.mapper.SysFileMapper;
import com.study.system.service.SysFileService;
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
public class SysFileServiceImpl extends ServiceImpl<SysFileMapper, SysFile> implements SysFileService {

    private static final Logger logger = LoggerFactory.getLogger(SysFileServiceImpl.class);

}
