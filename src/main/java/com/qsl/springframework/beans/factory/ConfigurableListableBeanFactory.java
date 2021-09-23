package com.qsl.springframework.beans.factory;

import com.qsl.springframework.beans.BeansException;
import com.qsl.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.qsl.springframework.beans.factory.config.BeanDefinition;
import com.qsl.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 *
 * @author shuailong.qian
 * @date 2021/9/23
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
