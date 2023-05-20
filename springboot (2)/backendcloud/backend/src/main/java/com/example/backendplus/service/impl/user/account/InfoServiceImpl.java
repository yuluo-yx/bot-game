package com.example.backendplus.service.impl.user.account;

import com.example.backendplus.pojo.User;
import com.example.backendplus.service.impl.utils.UserDetailsImpl;
import com.example.backendplus.service.user.account.InfoService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname InfoServiceImpl
 * @Description TODO
 * @Date 2022/10/4 21:15
 * @Created by PoisonGodv
 */

@Service
public class InfoServiceImpl implements InfoService {
    @Override
    public Map<String, String> getinfo() {
        UsernamePasswordAuthenticationToken authentication =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authentication.getPrincipal();
        User user = loginUser.getUser();

        Map<String , String> map = new HashMap<>();
        map.put("error_message" , "success");
        map.put("id" , user.getId().toString());
        map.put("username" , user.getUsername());
        map.put("photo" , user.getPhoto());
        return map;
    }
}
