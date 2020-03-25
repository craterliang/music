package com.gmd.controller;

import com.github.pagehelper.PageInfo;
import com.gmd.pojo.User;
import com.gmd.service.UserService;
import com.gmd.util.DeleteFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("/register")
    public Integer register(User user){
        String md5Password = DigestUtils.md5DigestAsHex(user.getUserPwd().getBytes());
        user.setUserPwd(md5Password);
        return this.userService.insert(user);
    }
    @RequestMapping("/login")    //  localhost:8082/user/login
    public User login(User user) {
        String md5Password = DigestUtils.md5DigestAsHex(user.getUserPwd().getBytes());
        user.setUserPwd(md5Password);
        return this.userService.login(user);
    }
    
    @RequestMapping("/selectByName")
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
    public Integer updateUser(User user,Integer upBool) {
        if (upBool == 1) {
            deleteImgFile(user.getUserId());
        }
        return this.userService.updateByPrimaryKey(user);
    }

    @RequestMapping("/deleteById")
    public Integer deleteById(Integer userId) {
        deleteImgFile(userId);
        return this.userService.deleteByPrimaryKey(userId);
    }
    private void deleteImgFile(Integer id) {
        User user = selectById(id);
        String file = "D:/Windows_library/musicLib/img/" + user.getUserImage() + ".jpg";
        DeleteFileUtil.delete(file);
    }

}
