package com.example.backendplus.controller.user.account;

import com.example.backendplus.service.user.account.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Classname InfoServiceImpl
 * @Description TODO
 * @Date 2022/10/4 21:22
 * @Created by PoisonGodv
 */

@RestController
public class InfoController {

    @Autowired
    private InfoService infoService;
    
    @GetMapping("/user/account/info/")
    public Map<String , String> getinfo(){
        return infoService.getinfo();
    }

}
