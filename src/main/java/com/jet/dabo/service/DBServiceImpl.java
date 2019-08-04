package com.jet.dabo.service;

import com.jet.dabo.mapper.UserMapper;
import com.jet.dabo.model.UserDB;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DBServiceImpl implements UserServiceDB {

    @Resource
    private UserMapper userMapper;

    public void setUserMapper(UserMapper value) {
        userMapper = value;
    }

    @Override
    public UserDB getUserDBByID(int userID) {
        return userMapper.getUserDBByID(userID);
    }

    private static DBServiceImpl instance_ = null;
    private DBServiceImpl() {}
    public static DBServiceImpl getInstance() {
        if (instance_ == null) {
            synchronized (DBServiceImpl.class) {
                if (instance_ == null) {
                    instance_ = new DBServiceImpl();
                }
            }
        }
        return instance_;
    }
}
