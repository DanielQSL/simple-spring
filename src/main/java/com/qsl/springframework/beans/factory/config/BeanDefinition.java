package com.qsl.springframework.beans.factory.config;

/**
 * BeanDefinition
 * @author qianshuailong
 * @date 2021/9/17
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

}
