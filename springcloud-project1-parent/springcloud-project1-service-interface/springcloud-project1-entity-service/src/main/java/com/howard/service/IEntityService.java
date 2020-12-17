package com.howard.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IEntityService {
	@RequestMapping("/getEntityById")
	public String getEntityById();
	
	@RequestMapping("/getEntityByName")
	public String getEntityByName();
}
