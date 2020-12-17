package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ServiceA {

	@Value("${server.port}")
	private String serverPort;
	
	@RequestMapping("/getResult")
	public String getResult() {
		return "Result A, port number:" + serverPort;
	}

}
