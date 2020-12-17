package com.howard.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IRelationshipService {
	@RequestMapping("/getRelationship")
	public String getRelationship();
}
