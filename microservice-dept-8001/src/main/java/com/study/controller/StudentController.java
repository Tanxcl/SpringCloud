package com.study.controller;

import com.study.pojo.Student;
import com.study.service.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className: StudentController
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/7/1 22:34
 **/
@RestController
//@RequestMapping("/main")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @ResponseBody
    @RequestMapping("/query")
    public List<Student> query(){
        return studentService.query();
    }

    @RequestMapping("/update")
    public Student update(){
        return new Student("1","2","3","4","5");
//        studentService.update();
    }

    @RequestMapping("/delete")
    public void delete(){
//        studentService.delete();
    }
}
