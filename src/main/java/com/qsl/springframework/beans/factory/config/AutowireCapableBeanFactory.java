package com.qsl.springframework.beans.factory.config;

import com.qsl.springframework.beans.factory.BeanFactory;

/**
 * Extension of the {@link BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 *
 * @author shuailong.qian
 * @date 2021/9/23
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

}
