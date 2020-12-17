package configClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AppConfigClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(AppConfigClient.class, args);
	}

}
