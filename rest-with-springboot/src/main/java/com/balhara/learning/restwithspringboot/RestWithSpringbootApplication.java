package com.balhara.learning.restwithspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.balhara.learning.restwithspringboot.model"}) 
public class RestWithSpringbootApplication {

public static void main(String[] args) {
		SpringApplication.run(RestWithSpringbootApplication.class, args);
	}
}
