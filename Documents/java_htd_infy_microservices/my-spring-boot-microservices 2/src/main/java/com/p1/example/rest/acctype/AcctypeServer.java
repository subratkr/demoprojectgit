package com.p1.example.rest.acctype;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
public class AcctypeServer {

	protected Logger logger = Logger.getLogger(AcctypeServer.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "acc-type");

		SpringApplication.run(AcctypeServer.class, args);
	}
}
