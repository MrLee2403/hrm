package com.company.lee.service.impl;

import com.company.lee.dao.pojo.Dept;
import com.company.lee.service.iservice.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.rmi.ServerError;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:applicationContext.xml")
public class DeptServiceImplTest {
    @Autowired
    DeptService deptService;
    @Test
    public void save() {
    }

    @Test
    public void delete() {
        deptService.delete(1234);
        List<Dept> depts = deptService.findByPage(2,2);
        for (Dept dept:depts){
            System.err.println(dept);
        }


    }

    @Test
    public void update() {
    }

    @Test
    public void findByPage() {
        List<Dept> depts = deptService.findByPage(1,2);
        for (Dept dept:depts){
            System.err.println(dept);
        }
    }

    @Test
    public void findByName() {
        System.err.println("****"+deptService.findByName("a"));
        System.err.println("!!!!"+deptService.findByName("aa"));
    }

    @Test
    public void findById() {
        System.err.println("!!!!"+deptService.findById(1005));
        System.err.println("****"+deptService.findById(8888));
    }
}