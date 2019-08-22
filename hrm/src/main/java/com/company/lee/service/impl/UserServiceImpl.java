package com.company.lee.service.impl;

import com.company.lee.commons.Const;
import com.company.lee.commons.ResponseResult;
import com.company.lee.dao.UserDao;
import com.company.lee.dao.pojo.User;
import com.company.lee.service.iservice.IUserService;
import com.company.lee.utils.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service("iUserService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;

    @Override
    public ResponseResult<User> exist(String username) {
        int result = userDao.checkedUsername(username);
        return result > 0 ? ResponseResult.createSuccessMassage("用户名正确") : ResponseResult.createErrorMassage("用户名不存在，请注册");
    }


    @Override
    public ResponseResult<String> checkValid(String str, String type) {
        if (StringUtils.isNotBlank(type)) {
            if (Const.ValidType.USERNAME.equals(type)) {
                int resultCount = userDao.checkedUsername(str);
                if (resultCount > 0) {
                    return ResponseResult.createErrorMassage("用户名已存在");
                }
            }
            if (Const.ValidType.EMAIL.equals(type)) {
                int resultCount = userDao.checkedEmail(str);
                if (resultCount > 0) {
                    return ResponseResult.createErrorMassage("Email已存在");
                }
            }

        }else {
            return ResponseResult.createErrorMassage("参数类型错误");
        }
        return ResponseResult.createSuccessMassage("用户名或Email可用");
    }

    @Override
    public ResponseResult<String> registry(User user) {
        //1-校验用户名是否存在
        ResponseResult responseResult = this.checkValid(user.getUsername(),Const.ValidType.USERNAME);
        if (!responseResult.isSuccess()){
            return ResponseResult.createErrorMassage("用户名已存在");
        }
        //2-校验Email是否存在
        responseResult = this.checkValid(user.getEmail(),Const.ValidType.EMAIL);
        if (!responseResult.isSuccess()){
            return ResponseResult.createErrorMassage("Email已存在");
        }
        //3-设置用户权限
        user.setRole(Const.Role.ROLE_USER);
        //4-MD5密码加密
        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        int resultCount = userDao.insert(user);
        if (resultCount==0){
            return ResponseResult.createErrorMassage("注册失败");
        }
        return ResponseResult.createSuccessMassage("注册成功");
    }


    @Override
    public ResponseResult<User> login(String username, String password) {
        int resultCount = userDao.checkedUsername(username);
        if (resultCount == 0) {
            return ResponseResult.createErrorMassage("用户名不存在");
        }
        String md5Password = MD5Util.MD5EncodeUtf8(password);
        User user = userDao.login(username, md5Password);
        if (user == null) {
            return ResponseResult.createErrorMassage("密码错误");
        }
        return ResponseResult.createSuccessMassage("登录成功", user);
    }
}
