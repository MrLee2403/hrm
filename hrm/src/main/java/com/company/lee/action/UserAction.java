package com.company.lee.action;

import com.company.lee.commons.Const;
import com.company.lee.commons.ResponseResult;
import com.company.lee.dao.pojo.User;
import com.company.lee.service.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/")
public class UserAction {

    @Autowired
    IUserService iUserService;

    /**
     * exist
     * @param username
     * @return
     */
    @RequestMapping(value = "exist.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<User> exist(String username){
        return iUserService.exist(username);
    }

    /**
     * login
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<User> login(String username, String password, HttpSession session) {
        ResponseResult<User> responseResult = iUserService.login(username, password);
        if (responseResult.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, responseResult.getCode());
        }
        return responseResult;
    }

    /**
     * logout
     * @param session
     * @return
     */
    @RequestMapping(value = "logout.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> logout(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return ResponseResult.createSuccessMassage("注销成功");
    }


    /**
     * 检测用户名邮箱是否可用
     * @param str
     * @param type
     * @return
     */
    @RequestMapping(value = "check_valid.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> checkValid(String str ,String type){
        return iUserService.checkValid(str,type);
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @RequestMapping(value = "registry.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> registry(User user){
        return iUserService.registry(user);
    }
}
