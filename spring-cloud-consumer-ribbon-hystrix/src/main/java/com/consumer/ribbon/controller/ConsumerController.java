package com.consumer.ribbon.controller;

import com.consumer.ribbon.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController
{
    @Autowired
    ConsumerService consumerService;

    @GetMapping(value = "/ribbon-consumer")
    public String helloConsumer() {
        return consumerService.consumer();
    }
}
