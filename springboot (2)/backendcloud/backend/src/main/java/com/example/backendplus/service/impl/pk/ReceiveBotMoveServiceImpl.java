package com.example.backendplus.service.impl.pk;

import com.example.backendplus.consumer.WebSocketServer;
import com.example.backendplus.consumer.utils.Game;
import com.example.backendplus.service.pk.ReceiveBotMoveService;
import org.springframework.stereotype.Service;

/**
 * @Classname ReceiveBotMoveServiceImpl
 * @Description TODO
 * @Date 2022/10/13 21:13
 * @Created by PoisonGodv
 */
@Service
public class ReceiveBotMoveServiceImpl implements ReceiveBotMoveService {
    @Override
    public String receiveBotMove(Integer userId, Integer direction) {
        if(WebSocketServer.users.get(userId) != null){
            Game game = WebSocketServer.users.get(userId).game;
            if(game != null){
                if (game.getPlayerA().getId().equals(userId)) {
                    game.setNextStepA(direction);
                } else if (game.getPlayerB().getId().equals(userId)) {
                    game.setNextStepB(direction);
                }
            }
        }

        return "receive bot move success";
    }
}
