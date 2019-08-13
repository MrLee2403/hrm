package com.company.lee.dao;

import com.company.lee.dao.pojo.EmpDim;

public interface EmpDimDao {
    int deleteByPrimaryKey(Integer eno);

    int insert(EmpDim record);

    int insertSelective(EmpDim record);

    EmpDim selectByPrimaryKey(Integer eno);

    int updateByPrimaryKeySelective(EmpDim record);

    int updateByPrimaryKey(EmpDim record);
}