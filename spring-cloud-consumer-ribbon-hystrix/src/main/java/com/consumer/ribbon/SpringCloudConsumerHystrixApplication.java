package com.consumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringCloudApplication
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudConsumerHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerHystrixApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate()
	{
	    return new RestTemplate();
	}

}
