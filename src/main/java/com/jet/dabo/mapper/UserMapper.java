package com.jet.dabo.mapper;

import com.jet.dabo.model.UserDB;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    UserDB getUserDBByID(int userID);

}
