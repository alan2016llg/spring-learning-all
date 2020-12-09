package com.demo.dao.impl;

import com.demo.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: liulg
 * @Date: 2020/9/18 11:00
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
// 此处应该是访问数据库的操作，用临时数据代替
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
