package com.example.backendplus.consumer.utils;

import com.example.backendplus.utils.JwtUtil;
import io.jsonwebtoken.Claims;

/**
 * @Classname JwtAuthentication
 * @Description TODO
 * @Date 2022/10/8 20:11
 * @Created by PoisonGodv
 */
public class JwtAuthentication {
    public static Integer getUserId(String token){
        int userId = -1;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userId = Integer.parseInt(claims.getSubject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return userId;
    }
}
