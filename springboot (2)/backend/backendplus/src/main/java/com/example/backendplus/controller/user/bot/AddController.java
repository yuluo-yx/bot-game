package com.example.backendplus.controller.user.bot;

import com.example.backendplus.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Classname AddController
 * @Description TODO
 * @Date 2022/10/7 19:59
 * @Created by PoisonGodv
 */

@RestController
public class AddController {
    @Autowired
    private AddService addService;

    @PostMapping("/user/bot/add/")
    public Map<String , String> add(@RequestParam Map<String , String> data){
        return addService.add(data);
    }
}
