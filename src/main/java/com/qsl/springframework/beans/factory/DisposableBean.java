package com.qsl.springframework.beans.factory;

/**
 * 销毁接口
 *
 * @author shuailong.qian
 * @date 2021/9/26
 */
public interface DisposableBean {

    /**
     * 销毁
     *
     * @throws Exception 异常
     */
    void destroy() throws Exception;

}
