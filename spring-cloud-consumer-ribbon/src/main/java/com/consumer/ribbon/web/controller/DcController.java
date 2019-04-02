package com.consumer.ribbon.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController
{
    
    @Resource
    private RestTemplate restTemplate;
    
    @GetMapping("/consumer")
    public String dc()
    {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}
