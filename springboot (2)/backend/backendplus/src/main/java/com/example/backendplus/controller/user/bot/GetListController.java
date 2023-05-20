package com.example.backendplus.controller.user.bot;

import com.example.backendplus.pojo.Bot;
import com.example.backendplus.service.user.bot.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname GetListController
 * @Description TODO
 * @Date 2022/10/7 21:17
 * @Created by PoisonGodv
 */
@RestController
public class GetListController {
    @Autowired
    private GetListService getListService;

    @GetMapping("/user/bot/getlist/")
    public List<Bot> getList(){
        return getListService.getList();
    }

}
