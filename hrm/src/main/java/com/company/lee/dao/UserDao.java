package com.company.lee.dao;

import com.company.lee.dao.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkedUsername(@Param("username") String username);

    User login(@Param("username") String username, @Param("password") String password);

    int checkedEmail(String email);
}