package com.qsl.springframework.context.support;

import com.qsl.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.qsl.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author shuailong.qian
 * @date 2021/9/24
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (configLocations != null) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
