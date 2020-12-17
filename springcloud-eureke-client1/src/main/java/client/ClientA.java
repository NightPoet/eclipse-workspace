package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientA {
	
	@Autowired
	private RestTemplate restTemplate;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@RequestMapping("doClientJob")
	public String doClientJob() {
		String serviceUrl = "http://test-api-1/getResult";
		String res = restTemplate.getForObject(serviceUrl, String.class);
		System.out.println("********************" + res);
		res = "ClientA do the job get the result from service:" + res;
		return res;
	}

}
