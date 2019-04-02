package com.consumer.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.service.DcClient;

@RestController
public class DcController
{
    
    @Resource
    DcClient dcClient;
    
    @GetMapping("consumer")
    public String dc()
    {
        return dcClient.consumer();
    }
}
