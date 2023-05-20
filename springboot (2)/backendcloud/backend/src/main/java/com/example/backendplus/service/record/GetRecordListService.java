package com.example.backendplus.service.record;

import com.alibaba.fastjson2.JSONObject;

/**
 * @Classname GetRecordListService
 * @Description TODO
 * @Date 2022/10/14 20:16
 * @Created by PoisonGodv
 */
public interface GetRecordListService {
    JSONObject getList(Integer page);
}
