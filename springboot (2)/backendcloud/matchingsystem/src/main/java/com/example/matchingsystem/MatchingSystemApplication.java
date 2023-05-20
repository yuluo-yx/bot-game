package com.example.matchingsystem;

import com.example.matchingsystem.service.impl.MatchingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2022/10/11 20:48
 * @Created by PoisonGodv
 */

@SpringBootApplication
public class MatchingSystemApplication {

    public static void main(String[] args) {

        MatchingServiceImpl.matchingPool.start();//启动匹配线程
        SpringApplication.run(MatchingSystemApplication.class , args);
    }
}
