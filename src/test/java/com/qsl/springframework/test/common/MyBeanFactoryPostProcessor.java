package com.qsl.springframework.test.common;

import com.qsl.springframework.beans.BeansException;
import com.qsl.springframework.beans.PropertyValue;
import com.qsl.springframework.beans.PropertyValues;
import com.qsl.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.qsl.springframework.beans.factory.config.BeanDefinition;
import com.qsl.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author shuailong.qian
 * @date 2021/9/24
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
