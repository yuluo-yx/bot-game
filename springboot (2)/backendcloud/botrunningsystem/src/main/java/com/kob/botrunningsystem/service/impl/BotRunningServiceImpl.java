package com.kob.botrunningsystem.service.impl;

import com.kob.botrunningsystem.service.BotRunningService;
import com.kob.botrunningsystem.service.impl.utils.BotPool;
import org.springframework.stereotype.Service;

/**
 * @Classname BotRunningServiceImpl
 * @Description TODO
 * @Date 2022/10/13 17:37
 * @Created by PoisonGodv
 */

@Service
public class BotRunningServiceImpl implements BotRunningService {
    public final static BotPool botPool = new BotPool();
    @Override
    public String addBot(Integer userId, String botCode, String input) {
        botPool.addBot(userId , botCode , input);
        return "add bot success";
    }
}
