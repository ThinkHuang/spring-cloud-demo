package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class SpringCloudClientCluster2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClientCluster2Application.class, args);
	}

}
