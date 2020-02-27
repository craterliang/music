package com.gmd.test;

import com.gmd.pojo.User;
import com.gmd.service.UserService;
import javafx.scene.input.DataFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
    @Autowired
    private UserService userService;

    @Test
    public  void ff(){
        /*User user =new  User();
        for ( int i = 1; i<50 ; i++) {
            *//*user.setUserId("user"+i);*//*
            user.setUserName("libao"+i);
            user.setUserSex(1);
            user.setUserPwd(i+"1djbnjankj342332"+i);
            user.setUserEmail(i+i+i+"@qq.com");
            user.setUserImage(i+"213fsdf22313");
            user.setUserRole(0);
            user.setUserAge(i+"2020");
            user.setUserRdate("2020"+i);
            this.userService.insert(user);
        }*/
        //System.out.println(this.userService.selectAll();
        Integer i =1;
        System.out.println(this.userService.selectByPrimaryKey(6));
        //System.out.println(this.userService.deleteByPrimaryKey(50));

    }
}
