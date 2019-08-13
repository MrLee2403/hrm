package com.company.lee.dao;

import com.company.lee.dao.pojo.Job;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JobDaoTest {
    @Autowired
    JobDao jobDao;
    @Test
    public void findAll() {
        for (Job job:jobDao.findAll()){
            System.err.println(job);
        }
    }

    @Test
    public void findByName() {
        for (Job job:jobDao.findByName("a")){
            System.err.println("!!!!!!!!!!!"+job);
        }
    }
}