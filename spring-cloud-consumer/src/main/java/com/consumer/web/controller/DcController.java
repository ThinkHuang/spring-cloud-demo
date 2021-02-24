package com.consumer.web.controller;

import javax.annotation.Resource;

import com.consumer.web.service.HelloService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController
{
    
    @Resource
    private LoadBalancerClient loadBalancerClient;

    @Resource
    HelloService helloService;
    
//    @Resource
//    private RestTemplate restTemplate;
    
//    @GetMapping("/consumer")
//    public String dc() {
//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
//        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
//        System.out.println(url);
//        return restTemplate.getForObject(url, String.class);
//    }

    @GetMapping("/ribbon-customer")
    public String helloCustomer() {
        return helloService.helloService();
    }
}
