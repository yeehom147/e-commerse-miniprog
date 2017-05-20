package com.yeehom.ecommerseminiprog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ECommerseMiniprogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerseMiniprogApplication.class, args);
	}
}
