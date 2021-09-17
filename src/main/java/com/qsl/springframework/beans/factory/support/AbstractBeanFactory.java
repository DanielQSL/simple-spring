package com.qsl.springframework.beans.factory.support;

import com.qsl.springframework.beans.BeansException;
import com.qsl.springframework.beans.factory.BeanFactory;
import com.qsl.springframework.beans.factory.config.BeanDefinition;

/**
 * 抽象类定义模板方法
 *
 * @author qianshuailong
 * @date 2021/9/17
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

}
