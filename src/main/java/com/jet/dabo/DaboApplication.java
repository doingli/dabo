package com.jet.dabo;

import com.jet.dabo.mapper.UserMapper;
import com.jet.dabo.redis.RedisOps;
import com.jet.dabo.service.DBServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootApplication
public class DaboApplication {

	public DaboApplication(UserMapper userMapper, StringRedisTemplate template) {
		DBServiceImpl.getInstance().setUserMapper(userMapper);
		RedisOps.getInstance().setStringRedisTemplate(template);
	}

	public static void main(String[] args) {
		SpringApplication.run(DaboApplication.class, args);
	}

}
