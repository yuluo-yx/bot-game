package com.example.backendplus.service.user.account;

import java.util.Map;

/**
 * @Classname RegisterService
 * @Description TODO
 * @Date 2022/10/4 20:20
 * @Created by PoisonGodv
 */
public interface RegisterService {
    Map<String ,String> register(String usernaem, String password, String confirmedPassword);
}
