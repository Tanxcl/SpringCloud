package com.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @className: student
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/7/1 22:07
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)    //链式编程
public class Student {
    private String id;
    private String name;
    private String sex;
    private String age;
    private String dbSource;    //来自于哪个数据库
}
