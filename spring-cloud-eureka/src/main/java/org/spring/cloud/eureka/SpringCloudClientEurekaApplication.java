package org.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudClientEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientEurekaApplication.class, args);
    }
}
