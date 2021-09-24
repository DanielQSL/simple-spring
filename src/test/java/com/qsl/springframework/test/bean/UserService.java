package com.qsl.springframework.test.bean;

/**
 * @author qianshuailong
 * @date 2021/9/17
 */
public class UserService {

    private String name;

    private String userId;

    private String company;

    private String location;

    private UserDao userDao;

    public UserService() {
    }

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息: " + userDao.queryUserName(userId));
    }

    public String queryUserInfo2() {
        return userDao.queryUserName(userId);
    }

    public String queryUserInfo3() {
        return userDao.queryUserName(userId) + "," + company + "," + location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
