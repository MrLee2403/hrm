package com.company.lee.dao;

import com.company.lee.dao.pojo.Job;

public interface JobDao {
    int deleteByPrimaryKey(Integer jno);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}