package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.cg")
@EnableDiscoveryClient
@SpringBootApplication
public class UpdateCourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdateCourseServiceApplication.class, args);
	}

}
