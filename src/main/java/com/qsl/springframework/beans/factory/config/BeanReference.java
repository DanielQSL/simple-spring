package com.qsl.springframework.beans.factory.config;

/**
 * Bean的引用
 *
 * @author shuailong.qian
 * @date 2021/9/18
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
