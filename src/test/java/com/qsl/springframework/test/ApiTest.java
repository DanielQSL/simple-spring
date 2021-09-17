package com.qsl.springframework.test;

import com.qsl.springframework.beans.factory.config.BeanDefinition;
import com.qsl.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.qsl.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author qianshuailong
 * @date 2021/9/17
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userServiceSingleton = (UserService) beanFactory.getBean("userService");
        userServiceSingleton.queryUserInfo();
    }

}
