package com.qsl.springframework.beans.factory.config;

import com.qsl.springframework.beans.BeansException;

/**
 * @author shuailong.qian
 * @date 2021/9/24
 */
public interface BeanPostProcessor {

    /**
     * 在Bean对象初始化方法之前，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在Bean对象初始化方法之后，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
