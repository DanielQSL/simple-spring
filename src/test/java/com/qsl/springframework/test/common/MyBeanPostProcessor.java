package com.qsl.springframework.test.common;

import com.qsl.springframework.beans.BeansException;
import com.qsl.springframework.beans.factory.config.BeanPostProcessor;
import com.qsl.springframework.test.bean.UserService;

/**
 * @author shuailong.qian
 * @date 2021/9/24
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
    
}
