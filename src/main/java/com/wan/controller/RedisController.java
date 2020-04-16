package com.wan.controller;

import com.wan.entity.UserEntity;
import com.wan.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author wanxf
 * @date 2020/03/30
 */
@RestController
@RequestMapping("/redis/demo")
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private ValueOperations<String, Object> valueOperations;

    @PostMapping("/test")
    public void setUser(@RequestBody UserEntity userEntity){
        valueOperations.set("user2",userEntity);
        System.out.println(redisUtil.get("user2"));
    }
}
