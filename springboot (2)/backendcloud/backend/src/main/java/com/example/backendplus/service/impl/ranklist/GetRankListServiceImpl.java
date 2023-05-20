package com.example.backendplus.service.impl.ranklist;

import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backendplus.mapper.UserMapper;
import com.example.backendplus.pojo.User;
import com.example.backendplus.service.ranklist.GetRankListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname GetRankListServiceImpl
 * @Description TODO
 * @Date 2022/10/16 18:13
 * @Created by PoisonGodv
 */

@Service
public class GetRankListServiceImpl implements GetRankListService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public JSONObject getList(Integer page) {
        IPage<User> userIPage = new Page<>(page , 10);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("rating");
        List<User> users = userMapper.selectPage(userIPage , queryWrapper).getRecords();
        JSONObject resp = new JSONObject();
        for(User user : users)
            user.setPassword("");
        resp.put("users" , users);
        resp.put("users_count" , userMapper.selectCount(null));
        return resp;
    }
}
