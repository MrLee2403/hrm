package com.company.lee.dao;

import com.company.lee.dao.pojo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DeptDaoTest {
    @Autowired
    DeptDao deptDao;
    @Test
    public void findAll() {
        for (Dept dept:deptDao.findAll()){
            System.err.println(dept);
        }
    }
}