package com.study.service;

import com.study.pojo.Student;

import java.util.List;

/**
 * @className: StudentService
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/7/1 22:44
 **/
public interface StudentService {
    List<Student> query();

    void update();

    void delete();
}
