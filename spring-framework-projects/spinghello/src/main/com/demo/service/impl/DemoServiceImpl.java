package com.demo.service.impl;

import com.demo.dao.DemoDao;
import com.demo.factory.BeanFactory;
import com.demo.service.DemoService;

import java.util.List;

/**
 * @Author: liulg
 * @Date: 2020/9/18 11:03
 */
public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demodao");

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
