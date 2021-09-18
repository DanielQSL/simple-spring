package com.qsl.springframework.beans;

/**
 * 属性
 *
 * @author shuailong.qian
 * @date 2021/9/18
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
