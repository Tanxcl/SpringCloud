package com.study.business.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: DataTest
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/17 18:00
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("data_test")
public class DataTest {
//    private int id;
    private String name;
    private String sex;
    private String address;
    private String phone;
    private String del;
}
