package com.example.backendplus.controller.ranklist;

import com.alibaba.fastjson2.JSONObject;
import com.example.backendplus.service.ranklist.GetRankListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Classname GetRankListController
 * @Description TODO
 * @Date 2022/10/16 18:14
 * @Created by PoisonGodv
 */

@RestController
public class GetRankListController {

    @Autowired
    private GetRankListService getRankListService;

    @GetMapping("/ranklist/getlist/")
    public JSONObject getList(@RequestParam Map<String ,String> data){
        Integer page = Integer.parseInt(data.get("page"));
        return getRankListService.getList(page);
    }
}
