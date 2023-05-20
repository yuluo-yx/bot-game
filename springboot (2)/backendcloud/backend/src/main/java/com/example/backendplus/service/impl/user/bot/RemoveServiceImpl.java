package com.example.backendplus.service.impl.user.bot;

import com.example.backendplus.mapper.BotMapper;
import com.example.backendplus.pojo.Bot;
import com.example.backendplus.pojo.User;
import com.example.backendplus.service.impl.utils.UserDetailsImpl;
import com.example.backendplus.service.user.bot.RemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname RemoveServiceImpl
 * @Description TODO
 * @Date 2022/10/7 20:17
 * @Created by PoisonGodv
 */
@Service
public class RemoveServiceImpl implements RemoveService {
    @Autowired
    private BotMapper botMapper;

    @Override
    public Map<String, String> remove(Map<String, String> data) {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();

        User user = loginUser.getUser();
        int bot_id = Integer.parseInt(data.get("bot_id"));
        Bot bot = botMapper.selectById(bot_id);
        Map<String , String> map = new HashMap<>();
        if(bot == null){
            map.put("error_message" , "Bot不存在或已被删除");
            return map;
        }
        if(!bot.getUserId().equals(user.getId())){
            map.put("error_message" , "没有权限删除Bot");
            return map;
        }
        botMapper.deleteById(bot_id);
        map.put("error_message" , "success");

        return map;
    }
}
