package com.cloud.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudProvideApplication.class, args);
	}

}

