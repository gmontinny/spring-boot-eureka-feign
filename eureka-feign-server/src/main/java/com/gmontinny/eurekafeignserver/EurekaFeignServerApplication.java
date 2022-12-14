package com.gmontinny.eurekafeignserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaFeignServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignServerApplication.class, args);
	}

}
