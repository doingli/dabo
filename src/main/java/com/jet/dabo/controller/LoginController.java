package com.jet.dabo.controller;

import com.jet.dabo.model.UserDB;
import com.jet.dabo.redis.RedisOps;
import com.jet.dabo.service.DBServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    String login() {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("this is info");
        logger.error("this is error");

        UserDB userDB = DBServiceImpl.getInstance().getUserDBByID(1);
        logger.info("" + (userDB == null));

        RedisOps.getInstance().setValue("hello", "world");
        String v = RedisOps.getInstance().getValue("hello");

        return "user login," + v;
    }

    @RequestMapping("/logout")
    String logout() {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("this is info");
        logger.error("this is error");

        return "user logout";
    }
}
