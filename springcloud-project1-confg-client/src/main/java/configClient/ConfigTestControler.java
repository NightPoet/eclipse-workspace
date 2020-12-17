package configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestControler {
	
	@Value(value = "${workmodel}")
	private String workmodel;
	
	@RequestMapping("/getWorkModel")
	public String getWorkModel () {
		return workmodel;
	}
}
