package com.irctc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudTicketInfoProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTicketInfoProducerApplication.class, args);
	}

}
