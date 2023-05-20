package com.example.backendplus.controller.PK;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname BotInfoController
 * @Description TODO
 * @Date 2022/10/3 18:13
 * @Created by PoisonGodv
 */


@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public Map<String , String> getBotInfo(){
        Map<String , String> bot1 = new HashMap<>();
        bot1.put("name", "apple");
        bot1.put("rating", "1500");
        return bot1;
    }

}
