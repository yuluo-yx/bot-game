package com.example.backendplus.service.impl.user.account;

import com.example.backendplus.pojo.User;
import com.example.backendplus.service.impl.utils.UserDetailsImpl;
import com.example.backendplus.service.user.account.LoginService;
import com.example.backendplus.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname LoginServiceImpl
 * @Description TODO
 * @Date 2022/10/4 20:24
 * @Created by PoisonGodv
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Override
    public Map<String, String> getToken(String username, String password) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username , password);
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);//登录失败自动处理

        UserDetailsImpl loginUser = (UserDetailsImpl) authenticate.getPrincipal();
        User user = loginUser.getUser();

        String jwt = JwtUtil.createJWT(user.getId().toString());
        Map<String , String > map = new HashMap<>();

        map.put("error_message","success");

        map.put("token" , jwt);

        return map;
    }
}
