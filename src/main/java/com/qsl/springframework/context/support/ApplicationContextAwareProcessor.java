package com.qsl.springframework.context.support;

import com.qsl.springframework.beans.BeansException;
import com.qsl.springframework.beans.factory.config.BeanPostProcessor;
import com.qsl.springframework.context.ApplicationContext;
import com.qsl.springframework.context.ApplicationContextAware;

/**
 * 包装处理器
 *
 * @author shuailong.qian
 * @date 2021/9/27
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
    
}
