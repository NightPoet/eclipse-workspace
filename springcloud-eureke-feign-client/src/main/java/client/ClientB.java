package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientB {
	
	@Autowired
	private IClientB iClientB;
	
	@RequestMapping("/doClientJob")
	public String doClientJob() {
		String res = iClientB.getResult();
		System.out.println("********************" + res);
		res = "ClientB do the job get the result from service:" + res;
		return res;
	}

}
