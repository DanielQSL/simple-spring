package com.qsl.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源加载接口
 *
 * @author shuailong.qian
 * @date 2021/9/18
 */
public interface Resource {

    /**
     * 获取资源加载流
     *
     * @return 资源加载流
     * @throws IOException IO异常
     */
    InputStream getInputStream() throws IOException;

}
