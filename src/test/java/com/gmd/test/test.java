package com.gmd.test;

import com.gmd.pojo.Mp3Info;
import com.gmd.pojo.Singer;
import com.gmd.pojo.User;
import com.gmd.service.SingerService;
import com.gmd.service.UserService;
import com.gmd.util.Mp3InfoUtil;
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
    private SingerService userService;

    @Test
    public  void ff(){
        Singer user =new  Singer();
        for ( int i = 1; i<50 ; i++) {
            //*user.setUserId("user"+i);*//*
            user.setSingerName("张杰"+i);
            user.setSingerSex("1");
            user.setSingerDesc(i+"非常棒"+i);
            user.setSingerType("华语男歌手");
            user.setSingerImage("f876bc2a28c74579bbce5111a4616ecb");
            this.userService.insert(user);
        }
        //System.out.println(this.userService.selectAll();
        /*Integer i =1;
        System.out.println(this.userService.selectByPrimaryKey(6));*/
        //System.out.println(this.userService.deleteByPrimaryKey(50));

    }
    @Test
    public  void tt(){
            Mp3Info songInfo = new Mp3Info();
            songInfo= Mp3InfoUtil.getSongInfo("D:\\Windows_library\\musicLib\\video\\123345.mp3");
            System.out.println(songInfo);

        }
}
