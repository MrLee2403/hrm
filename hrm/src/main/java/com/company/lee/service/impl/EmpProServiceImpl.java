package com.company.lee.service.impl;

import com.company.lee.commons.Result;
import com.company.lee.dao.EmpProDao;
import com.company.lee.dao.pojo.EmpPro;
import com.company.lee.service.iservice.EmpProService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empProService")
public class EmpProServiceImpl implements EmpProService {
    @Autowired
    EmpProDao empProDao;

    @Override
    public String save(EmpPro empPro) {
        int result = empProDao.insertSelective(empPro);
        return result > 0 ? Result.SUCCESS : Result.ERROR;
    }

    @Override
    public String update(EmpPro empPro) {
        int result = empProDao.updateByPrimaryKeySelective(empPro);
        return result > 0 ? Result.SUCCESS : Result.ERROR;
    }

    @Override
    public String delete(Integer eno) {
        int result = empProDao.deleteByPrimaryKey(eno);
        return result > 0 ? Result.SUCCESS : Result.ERROR;
    }

    @Override
    public List<EmpPro> findByPage(int page, int size) {
        PageHelper.startPage(page, size);
        return empProDao.findAll();
    }

    @Override
    public EmpPro findById(Integer eno) {
        return empProDao.selectByPrimaryKey(eno);
    }
}
