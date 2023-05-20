package com.example.backendplus.service.impl.pk;

import com.example.backendplus.consumer.WebSocketServer;
import com.example.backendplus.service.pk.StartGameService;
import org.springframework.stereotype.Service;

/**
 * @Classname StartGameServiceImpl
 * @Description TODO
 * @Date 2022/10/12 21:02
 * @Created by PoisonGodv
 */

@Service
public class StartGameServiceImpl implements StartGameService {
    @Override
    public String startGame(Integer aId,Integer aBotId, Integer bId , Integer bBotId) {
        WebSocketServer.startGame(aId ,aBotId, bId , bBotId);
        return "start game success";
    }
}
