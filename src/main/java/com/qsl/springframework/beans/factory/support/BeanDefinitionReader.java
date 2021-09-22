package com.qsl.springframework.beans.factory.support;

import com.qsl.springframework.beans.BeansException;
import com.qsl.springframework.core.io.Resource;
import com.qsl.springframework.core.io.ResourceLoader;

/**
 * @author shuailong.qian
 * @date 2021/9/18
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
    
}
