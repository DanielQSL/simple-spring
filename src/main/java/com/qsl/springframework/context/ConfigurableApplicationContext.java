package com.qsl.springframework.context;

import com.qsl.springframework.beans.BeansException;

/**
 * @author shuailong.qian
 * @date 2021/9/24
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException Bean异常
     */
    void refresh() throws BeansException;

    /**
     * 注册关闭钩子
     */
    void registerShutdownHook();

    /**
     * 关闭
     */
    void close();

}
