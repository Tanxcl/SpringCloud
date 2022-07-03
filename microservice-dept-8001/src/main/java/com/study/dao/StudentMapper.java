package com.study.dao;

import com.study.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @className: StudentMapper
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/7/1 22:44
 **/
@Mapper
public interface StudentMapper {

//    @Select("select * from student")
    List<Student> query();

    void update();

    void delete();
}
