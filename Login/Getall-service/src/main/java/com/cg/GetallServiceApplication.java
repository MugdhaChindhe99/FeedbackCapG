package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.cg")
@EnableDiscoveryClient
public class GetallServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetallServiceApplication.class, args);
	}

}
