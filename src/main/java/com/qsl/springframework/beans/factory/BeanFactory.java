package com.qsl.springframework.beans.factory;

import com.qsl.springframework.beans.BeansException;

/**
 * Bean工厂
 *
 * @author qianshuailong
 * @date 2021/9/17
 */
public interface BeanFactory {

    /**
     * 获取 Bean 对象
     *
     * @param name Bean名字
     * @return Bean对象
     * @throws BeansException Bean异常
     */
    Object getBean(String name) throws BeansException;

}
