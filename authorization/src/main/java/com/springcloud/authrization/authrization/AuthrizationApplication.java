package com.springcloud.authrization.authrization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthrizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthrizationApplication.class, args);
    }

}
