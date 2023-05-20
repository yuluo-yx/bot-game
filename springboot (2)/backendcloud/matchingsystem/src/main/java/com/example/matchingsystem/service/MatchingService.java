package com.example.matchingsystem.service;

/**
 * @Classname MatchingService
 * @Description TODO
 * @Date 2022/10/11 20:51
 * @Created by PoisonGodv
 */
public interface MatchingService {
    String addPlayer(Integer userId , Integer rating , Integer botId);
    String removePlayer(Integer userId);
}
