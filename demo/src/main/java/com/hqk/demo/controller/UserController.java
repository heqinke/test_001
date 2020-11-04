package com.hqk.demo.controller;

import com.hqk.demo.bean.User;
import com.hqk.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author HHHQK
 * @Date 2020/11/4 23:04
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<User> findAll(){
        List<User> users = new ArrayList<>();
        users = userService.findAll();
        return users;
    }


    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable Integer id){
        User user = new User();
        user = userService.findById(id);
        return user;
    }

    @RequestMapping(value = "/updateUserById")
    public void updateUserById(@PathVariable Integer id){
        userService.updateUserById(id);
    }

    @RequestMapping(value = "/insertUser")
    public void insertUser(User user){
        userService.insertUser(user);
    }

    @RequestMapping(value = "/deleteUserById/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }

}
