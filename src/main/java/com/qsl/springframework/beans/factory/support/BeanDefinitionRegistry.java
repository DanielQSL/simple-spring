package com.qsl.springframework.beans.factory.support;

import com.qsl.springframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册器
 *
 * @author qianshuailong
 * @date 2021/9/17
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
