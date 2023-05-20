package com.example.backendplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backendplus.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2022/10/3 19:32
 * @Created by PoisonGodv
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
