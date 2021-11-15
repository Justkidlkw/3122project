package com.microservice.apiservice;

import com.microservice.apiservice.entity.Log.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiServiceApplication.class, args);

		new RestTemplate().put("http://elasticsearch:9200/logs", new Log());
	}

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
