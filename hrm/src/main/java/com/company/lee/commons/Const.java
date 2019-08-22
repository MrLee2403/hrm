package com.company.lee.commons;

public class Const {
    public static final String CURRENT_USER = "current_user";

    public interface Role {
        int ROLE_USER = 0;//用户
        int ROLE_ADMIN = 1;//管理员
    }

    public interface ValidType {
        String EMAIL = "email";
        String USERNAME = "username";
    }
}
