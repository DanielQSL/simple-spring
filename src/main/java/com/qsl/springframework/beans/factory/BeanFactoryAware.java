package com.qsl.springframework.beans.factory;

import com.qsl.springframework.beans.BeansException;

/**
 * Interface to be implemented by beans that wish to be aware of their
 * owning {@link BeanFactory}.
 * <p>
 * 实现此接口，既能感知到所属的 BeanFactory
 *
 * @author shuailong.qian
 * @date 2021/9/26
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
    
}
