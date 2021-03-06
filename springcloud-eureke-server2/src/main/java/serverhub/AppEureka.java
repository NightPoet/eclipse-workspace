package serverhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppEureka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(AppEureka.class, args);
	}

}
