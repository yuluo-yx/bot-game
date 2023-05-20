package com.example.backendplus.controller.record;

import com.alibaba.fastjson2.JSONObject;
import com.example.backendplus.service.record.GetRecordListService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Classname GetRecordListController
 * @Description TODO
 * @Date 2022/10/14 20:21
 * @Created by PoisonGodv
 */
@RestController
public class GetRecordListController {

    @Autowired
    private GetRecordListService getRecordListService;

    @GetMapping("/record/getlist/")
    JSONObject getList(@RequestParam Map<String , String> data){
        Integer page = Integer.parseInt(data.get("page"));
        return getRecordListService.getList(page);
    }


}
