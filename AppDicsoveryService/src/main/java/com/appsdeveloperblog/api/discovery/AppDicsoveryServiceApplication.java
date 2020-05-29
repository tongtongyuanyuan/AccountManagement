package com.appsdeveloperblog.api.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppDicsoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppDicsoveryServiceApplication.class, args);
	}

}

