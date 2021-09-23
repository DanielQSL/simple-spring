package com.qsl.springframework.beans.factory.config;

import com.qsl.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * Configuration interface to be implemented by most bean factories. Provides
 * facilities to configure a bean factory, in addition to the bean factory
 * client methods in the {@link com.qsl.springframework.beans.factory.BeanFactory}
 * interface.
 *
 * @author shuailong.qian
 * @date 2021/9/23
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

}
