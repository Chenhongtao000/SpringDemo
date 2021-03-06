package com.springcloud.consumer.FeignService;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "spring-cloud-user",path = "/usermanager" ,fallback = UserFeignServiceFallBack.class)
public interface  UserFeignService {

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String hello(@PathVariable("id") String id);

}
