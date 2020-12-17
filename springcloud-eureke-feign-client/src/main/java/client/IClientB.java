package client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "test-api-1")
public interface IClientB {
	@RequestMapping("/getResult")
	public String getResult();
}
