package com.appsdeveloperblog.api.users;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.PKCS1v1_5Padding_PublicOnly;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.google.common.collect.Table.Cell;

@SpringBootApplication
@EnableEurekaClient
public class EurekaApiUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApiUsersApplication.class, args);
	}

}
