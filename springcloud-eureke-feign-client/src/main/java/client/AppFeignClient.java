package client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AppFeignClient {
	public static void main(String[] args) {
		// TOXXDO Auto-generated method stub
		SpringApplication.run(AppFeignClient.class, args);
	}
}
