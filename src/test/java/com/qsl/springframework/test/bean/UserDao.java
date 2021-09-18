package com.qsl.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shuailong.qian
 * @date 2021/9/18
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("1001", "qsl");
        hashMap.put("1002", "tom");
        hashMap.put("1003", "mary");
    }

    public String queryUserName(String userId) {
        return hashMap.get(userId);
    }
    
}
