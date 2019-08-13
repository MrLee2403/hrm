package com.company.lee.dao;

import com.company.lee.dao.pojo.Dept;

import java.util.List;

public interface DeptDao {
    int deleteByPrimaryKey(Integer dno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer dno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
    List<Dept> findAll();
}