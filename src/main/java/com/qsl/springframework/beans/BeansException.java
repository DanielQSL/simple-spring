package com.qsl.springframework.beans;

/**
 * Bean 异常
 *
 * @author qianshuailong
 * @date 2021/9/17
 */
public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }

}
