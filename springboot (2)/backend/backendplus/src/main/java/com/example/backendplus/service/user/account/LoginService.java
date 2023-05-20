package com.example.backendplus.service.user.account;

import java.util.Map;

/**
 * @Classname LoginService
 * @Description TODO
 * @Date 2022/10/4 20:20
 * @Created by PoisonGodv
 */
public interface LoginService {
    public Map<String , String> getToken(String username, String password);


}
