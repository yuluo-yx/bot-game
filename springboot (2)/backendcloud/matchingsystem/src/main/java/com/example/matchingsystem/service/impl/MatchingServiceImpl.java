package com.example.matchingsystem.service.impl;

import com.example.matchingsystem.service.MatchingService;
import com.example.matchingsystem.service.impl.utils.MatchingPool;
import org.springframework.stereotype.Service;

/**
 * @Classname MatchingServiceImpl
 * @Description TODO
 * @Date 2022/10/11 20:52
 * @Created by PoisonGodv
 */
@Service
public class MatchingServiceImpl implements MatchingService {
    public final static MatchingPool matchingPool = new MatchingPool();

    @Override
    public String addPlayer(Integer userId, Integer rating, Integer botId) {
        matchingPool.addPlayer(userId, rating , botId);
        return "add player success";
    }

    @Override
    public String removePlayer(Integer userId) {
        matchingPool.removePlayer(userId);
        return "remove player success";
    }
}
