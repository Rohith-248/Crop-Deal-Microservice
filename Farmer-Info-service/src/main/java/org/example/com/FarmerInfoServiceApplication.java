package org.example.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FarmerInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmerInfoServiceApplication.class, args);
	}

}
