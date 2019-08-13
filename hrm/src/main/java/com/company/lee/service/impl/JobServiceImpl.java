package com.company.lee.service.impl;

import com.company.lee.commons.Result;
import com.company.lee.dao.JobDao;
import com.company.lee.dao.pojo.Job;
import com.company.lee.service.iservice.JobService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jobService")
public class JobServiceImpl implements JobService {
    @Autowired
    JobDao jobDao;
    @Override
    public String save(Job job) {
        int result = jobDao.insertSelective(job);
        return result>0? Result.SUCCESS:Result.ERROR;

    }

    @Override
    public String delete(Integer jno) {
        int result = jobDao.deleteByPrimaryKey(jno);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String update(Job job) {
        int result = jobDao.updateByPrimaryKeySelective(job);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public List<Job> findByPage(int page, int size) {
        PageHelper.startPage(page, size);
        return jobDao.findAll();
    }

    @Override
    public List<Job> findByName(String jname) {
        return jobDao.findByName(jname);
    }

    @Override
    public Job findById(int jno) {
        return jobDao.selectByPrimaryKey(jno);
    }
}
