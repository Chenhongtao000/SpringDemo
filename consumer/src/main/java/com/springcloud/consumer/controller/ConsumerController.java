package com.springcloud.consumer.controller;

import com.springcloud.consumer.FeignService.UserFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    UserFeignService userFeignService;
    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return userFeignService.hello(name);
    }
}
