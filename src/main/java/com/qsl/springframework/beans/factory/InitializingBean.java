package com.qsl.springframework.beans.factory;

/**
 * 初始化接口
 *
 * @author shuailong.qian
 * @date 2021/9/26
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception 异常
     */
    void afterPropertiesSet() throws Exception;

}
