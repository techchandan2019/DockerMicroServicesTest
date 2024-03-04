package com.bonami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaClient
public class MsprojProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsprojProductServiceApplication.class, args);
	}

	@Bean
	public Sampler createSamplerObject() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
