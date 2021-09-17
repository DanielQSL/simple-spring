package com.qsl.springframework.beans.factory.config;

/**
 * @author qianshuailong
 * @date 2021/9/17
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
