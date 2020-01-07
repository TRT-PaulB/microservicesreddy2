package com.micro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RollingstoneEcommerceProductApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RollingstoneEcommerceProductApiApplication.class, args);
	}

}
