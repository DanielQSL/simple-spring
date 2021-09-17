package com.qsl.springframework.beans.factory.support;

import com.qsl.springframework.beans.BeansException;
import com.qsl.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 实例化策略接口
 *
 * @author qianshuailong
 * @date 2021/9/17
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
