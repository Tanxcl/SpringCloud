package com.study.business.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.business.entity.DataTest;
import com.study.business.mapper.DataTestMapper;
import com.study.business.service.DataTestService;
import org.springframework.stereotype.Service;

/**
 * @className: DataTestServiceImpl
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/17 18:01
 **/
@Service
public class DataTestServiceImpl extends ServiceImpl<DataTestMapper, DataTest> implements DataTestService {
}
