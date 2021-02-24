package com.consumer.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService
{
    private final static Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback", commandKey = "helloKey")
    public String consumer() {
        long start = System.currentTimeMillis();
        String result = restTemplate.getForEntity("http://EUREKA-CLIENT/hello", String.class).getBody();
        long end = System.currentTimeMillis();
        logger.info("Spend Time: {}" , end - start);
        return result;
    }

    public String fallback() {
        return "error";
    }
}
