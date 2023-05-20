package com.example.backendplus.controller.user.bot;

import com.example.backendplus.service.user.bot.RemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Classname RemoveController
 * @Description TODO
 * @Date 2022/10/7 20:29
 * @Created by PoisonGodv
 */

@RestController
public class RemoveController {
    @Autowired
    private RemoveService removeService;

    @PostMapping("/user/bot/remove/")
    public Map<String , String> remove(@RequestParam Map<String , String> data){
        return removeService.remove(data);
    }

}
