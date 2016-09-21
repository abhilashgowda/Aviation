package com.aviation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import feign.Logger;

@SpringBootApplication/*(exclude = { SecurityAutoConfiguration.class })*/
@EnableFeignClients
/*@EnableEurekaClient*/
public class AviationMicroApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(AviationMicroApplication.class, args);
	}

	
	@Bean
	public Logger.Level feignLoggerLevel() {
	return Logger.Level.FULL;
	}
}
