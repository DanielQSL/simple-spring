package com.qsl.springframework.beans.factory.config;

import com.qsl.springframework.beans.BeansException;
import com.qsl.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author shuailong.qian
 * @date 2021/9/24
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的BeanDefinition加载完成后，实例化Bean对象之前，提供修改BeanDefinition属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
    
}
