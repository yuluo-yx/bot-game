package com.example.backendplus.service.ranklist;

import com.alibaba.fastjson2.JSONObject;

/**
 * @Classname GetRankListService
 * @Description TODO
 * @Date 2022/10/16 18:12
 * @Created by PoisonGodv
 */
public interface GetRankListService {
    JSONObject getList(Integer page);
}
