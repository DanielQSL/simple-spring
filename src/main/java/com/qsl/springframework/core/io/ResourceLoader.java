package com.qsl.springframework.core.io;

/**
 * @author shuailong.qian
 * @date 2021/9/18
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
    
}
