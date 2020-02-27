package com.gmd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gmd.mapper")
public class MusicApplication {
    public static void main(String[] args) { SpringApplication.run(MusicApplication.class, args);
    }

}