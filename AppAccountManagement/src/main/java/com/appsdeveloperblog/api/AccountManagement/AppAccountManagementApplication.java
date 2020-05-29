package com.appsdeveloperblog.api.AccountManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppAccountManagementApplication.class, args);
	}

}
