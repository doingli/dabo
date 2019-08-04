package com.jet.dabo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

public class RedisOps {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void setStringRedisTemplate(StringRedisTemplate template) {
        stringRedisTemplate = template;
    }

    public String getValue(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public void setValue(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    private static RedisOps instance_ = null;
    private RedisOps() {}
    public static RedisOps getInstance() {
        if (instance_ == null) {
            synchronized (RedisOps.class) {
                if (instance_ == null) {
                    instance_ = new RedisOps();
                }
            }
        }
        return instance_;
    }
}
