package com.jet.dabo;

import com.jet.dabo.mapper.UserMapper;
import com.jet.dabo.service.DBServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaboApplication {

	public DaboApplication(UserMapper userMapper) {
		DBServiceImpl.getInstance().setUserMapper(userMapper);
	}

	public static void main(String[] args) {
		SpringApplication.run(DaboApplication.class, args);
	}

}
