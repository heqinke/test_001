package com.hqk.demo.service;

import com.hqk.demo.bean.User;

import java.util.Collection;
import java.util.List;

/**
 * @Author HHHQK
 * @Date 2020/11/4 23:04
 */
public interface UserService {

    List<User> findAll();

    User findById(Integer id);

    void updateUserById(Integer id);

    void insertUser(User user);

    void deleteUser(Integer id);
}
