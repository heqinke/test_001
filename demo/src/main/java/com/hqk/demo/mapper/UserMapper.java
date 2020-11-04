package com.hqk.demo.mapper;

import com.hqk.demo.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
 * @Author HHHQK
 * @Date 2020/11/4 23:03
 */

@Component(value="userMapper")
public interface UserMapper {


    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where id=#{id}")
    User findById(@Param("id") Integer id);

    @Update("update user set sex=#{sex}")
    void updateUserById(@Param("id")Integer id);

    @Insert("insert into user (mobile,password, sex,birthday,address,email,state,create_time,update_time)\n" +
            "        values (#{mobile}, #{password}, #{sex}, #{birthday}, #{address}, #{email}, #{state}, #{create_time}, #{update_time})")
    void insertUser(User user);

    @Delete("delete from user where id=#{id}")
    void deleteUser(@Param("id")Integer id);
}
