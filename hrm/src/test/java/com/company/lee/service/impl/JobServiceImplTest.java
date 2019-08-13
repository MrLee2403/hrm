package com.company.lee.service.impl;

import com.company.lee.dao.pojo.Job;
import com.company.lee.service.iservice.JobService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JobServiceImplTest {
    @Autowired
    JobService jobService;
    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void findByPage() {
        List<Job> jobs = jobService.findByPage(2,2);
        for (Job job:jobs){
            System.err.println(job);
        }
    }

    @Test
    public void findByName() {
        List<Job> jobs = jobService.findByName("a");
        for (Job job:jobs){
            System.err.println(job);
        }
    }

    @Test
    public void findById() {
        System.err.println(jobService.findById(4));
    }
}