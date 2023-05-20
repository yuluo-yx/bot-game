package com.example.backendplus.service.user.account;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.backendplus.mapper.BotMapper;
import com.example.backendplus.pojo.Bot;
import com.example.backendplus.pojo.User;
import com.example.backendplus.service.impl.utils.UserDetailsImpl;
import com.example.backendplus.service.user.bot.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname GetListServiceImpl
 * @Description TODO
 * @Date 2022/10/7 21:12
 * @Created by PoisonGodv
 */
@Service
public class GetListServiceImpl implements GetListService{
    @Autowired
    private BotMapper botMapper;

    @Override
    public List<Bot> getList() {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();
        QueryWrapper<Bot> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id" , user.getId());
        return botMapper.selectList(queryWrapper);
    }
}
