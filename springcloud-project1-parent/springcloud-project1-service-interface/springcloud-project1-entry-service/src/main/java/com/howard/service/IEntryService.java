package com.howard.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IEntryService {
	@RequestMapping("/getEntryById")
	public String getEntryById();
	
	@RequestMapping("/getEntryByName")
	public String getEntryByName();
}
