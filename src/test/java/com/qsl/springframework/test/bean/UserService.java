package com.qsl.springframework.test.bean;

/**
 * @author qianshuailong
 * @date 2021/9/17
 */
public class UserService {

    private String name;

    private String userId;

    private UserDao userDao;

    public UserService() {
    }

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息: " + userDao.queryUserName(userId));
    }

}
