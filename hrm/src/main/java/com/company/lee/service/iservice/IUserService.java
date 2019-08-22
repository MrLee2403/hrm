package com.company.lee.service.iservice;

import com.company.lee.commons.ResponseResult;
import com.company.lee.dao.pojo.User;

import javax.servlet.http.HttpSession;

public interface IUserService {
    ResponseResult<User> login(String username, String password);

    ResponseResult<User> exist(String username);

    ResponseResult<String> checkValid(String str ,String type);

    ResponseResult<String> registry(User user);
}
