package com.qsl.springframework.context;

import com.qsl.springframework.beans.BeansException;
import com.qsl.springframework.beans.factory.Aware;

/**
 * Interface to be implemented by any object that wishes to be notified
 * of the {@link ApplicationContext} that it runs in.
 * <p>
 * 实现此接口，既能感知到所属的 ApplicationContext
 *
 * @author shuailong.qian
 * @date 2021/9/26
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
