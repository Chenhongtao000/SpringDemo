package com.springcloud.consumer.FeignService;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class UserFeignServiceFallBack implements UserFeignService {

    @Override
    public String hello(@PathVariable("id") String id) {
        return "hello" +id+", this messge send failed ";
    }
}
