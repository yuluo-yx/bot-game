package com.kob.botrunningsystem;

import com.kob.botrunningsystem.service.impl.BotRunningServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname BotRunningSystemApplication
 * @Description TODO
 * @Date 2022/10/13 17:31
 * @Created by PoisonGodv
 */

@SpringBootApplication
public class BotRunningSystemApplication {
    public static void main(String[] args)
    {
        BotRunningServiceImpl.botPool.start();
        SpringApplication.run(BotRunningSystemApplication.class , args);
    }
}
