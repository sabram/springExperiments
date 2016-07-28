package com.shaunabram.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringExperimentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExperimentsApplication.class, args);
	}

	@Bean
	public String str() {
		return "test";
	}

	@Bean
	public Greeting mongoDB() {
		return new Greeting("mongoDB");
	}

	@Bean
	public Greeting mongoDBRead() {
		return new Greeting("mongoDBRead");
	}
}
