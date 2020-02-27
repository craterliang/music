package com.gmd.controller;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.User;
import com.gmd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("/register")
    public Integer register(User user){
        return this.userService.insert(user);
    }
    @RequestMapping("/login")    //  localhost:8082/user/login
    public User login(User user) {
        return this.userService.login(user);
    }
    
    @RequestMapping("/selectByName")    //  localhost:8082/user/selectByName
    public Integer selectByName(String uname) {
        User user = this.userService.selectByName(uname);
        if (user == null) {
            return 1;
        } else {
            return 0;
        }

    }
    @RequestMapping("/selectById")
    public User selectById(Integer Id) {

        User user = userService.selectByPrimaryKey(Id);
        return user;
    }

    @RequestMapping("/findAll")
    public PageInfo<User> findAll(String uname, Integer pageNumber) {
        if (uname != null && uname != "") {
            uname = "%" + uname + "%";
        } else {
            uname = "%%";
        }
        return this.userService.findUserByname(uname, pageNumber);
    }

    @RequestMapping("/selectByNameEmail")
    public User  selectByNameEmail(User user) {
        return  userService.selectByNameEmail(user);
    }

    @RequestMapping("/updateUser")
    public Integer updateUser(User user) {
        return this.userService.updateByPrimaryKey(user);
    }
    @RequestMapping("/updateUserById")
    public Integer updateUserById(User user) {

        return this.userService.updateUserById(user);
    }


    @RequestMapping("/deleteById")
    public Integer deleteById(Integer userId) {
        return this.userService.deleteByPrimaryKey(userId);
    }


}
