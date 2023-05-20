package com.example.backendplus.controller.user.account;

import com.example.backendplus.service.user.account.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Classname LoginController
 * @Description TODO
 * @Date 2022/10/4 20:32
 * @Created by PoisonGodv
 */

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/user/account/token/")
    public Map<String ,String> getToken(@RequestParam Map<String , String> map ){
        String username = map.get("username");
        String password = map.get("password");
        return loginService.getToken(username , password);
    }
}
