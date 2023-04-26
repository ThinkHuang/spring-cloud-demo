package com.example.springcloud.client.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudClientOpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientOpenfeignApplication.class, args);
    }

}
