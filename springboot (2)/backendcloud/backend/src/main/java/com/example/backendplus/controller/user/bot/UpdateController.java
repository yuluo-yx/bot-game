package com.example.backendplus.controller.user.bot;

import com.example.backendplus.service.user.bot.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Classname UpdateController
 * @Description TODO
 * @Date 2022/10/7 20:52
 * @Created by PoisonGodv
 */
@RestController
public class UpdateController {
    @Autowired
    private UpdateService updateService;

    @PostMapping("/user/bot/update/")
    public Map<String ,String> update(@RequestParam Map<String ,String> data){
        return updateService.update(data);
    }

}
