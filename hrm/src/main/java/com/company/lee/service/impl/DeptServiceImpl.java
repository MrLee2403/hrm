package com.company.lee.service.impl;

import com.company.lee.commons.Result;
import com.company.lee.dao.DeptDao;
import com.company.lee.dao.pojo.Dept;
import com.company.lee.service.iservice.DeptService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;
    @Override
    public String save(Dept dept) {
        int result = deptDao.insert(dept);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String delete(Integer dno) {
        int result = deptDao.deleteByPrimaryKey(dno);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String update(Dept dept) {
        int result = deptDao.updateByPrimaryKeySelective(dept);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public List<Dept> findByPage(int page, int size) {
        PageHelper.startPage(page, size);
        return deptDao.findAll();
    }

    @Override
    public List<Dept> findByName(String dname) {
        return deptDao.findByName(dname);
    }

    @Override
    public Dept findById(Integer dno) {
        return deptDao.selectByPrimaryKey(dno);
    }
}
