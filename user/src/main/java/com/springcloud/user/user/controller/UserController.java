package com.springcloud.user.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usermanager")
public class UserController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserByID(@PathVariable String id){

        return "get User _id： " +id +" this is from " +port;
    }
}
