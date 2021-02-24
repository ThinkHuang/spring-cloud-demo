package org.spring.cloud.eureka.web;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {
    
    private final Logger logger = Logger.getLogger(HelloController.class);
    
    @Resource
    private DiscoveryClient client;
    
    @GetMapping("/hello")
    public String index() throws InterruptedException
    {
        ServiceInstance instance = client.getLocalServiceInstance();
        // 让处理线程等待几秒钟
        int sleepTime = new Random().nextInt(3000);
        logger.info("sleepTime:" + sleepTime);
        Thread.sleep(sleepTime);

        logger.info("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "Hello World";
    }
}
