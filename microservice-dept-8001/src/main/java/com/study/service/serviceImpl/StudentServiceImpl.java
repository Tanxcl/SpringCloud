package com.study.service.serviceImpl;

import com.study.dao.StudentMapper;
import com.study.pojo.Student;
import com.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: StudentServiceImpl
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/7/1 22:45
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> query() {
        return studentMapper.query();
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
