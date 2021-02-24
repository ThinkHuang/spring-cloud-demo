package com.consumer.web.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HelloService
{
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        System.out.println("Fall Back");
        return restTemplate.getForEntity("http://EUREKA-CLIENT/hello", String.class).getBody();
    }

    public String helloFallback() {
        return "error";
    }
}
