package com.gmontinny.eurekafeightclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaFeightClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeightClientApplication.class, args);
	}

}
