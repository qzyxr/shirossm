package com.zking.mapper;

import com.zking.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

     /*
     根据用户输入的账号获取到用户的个人信息


      */
    public  User selectByUserName(String username);





}