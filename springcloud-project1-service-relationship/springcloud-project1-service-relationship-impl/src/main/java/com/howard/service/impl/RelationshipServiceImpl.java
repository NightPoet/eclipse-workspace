package com.howard.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howard.service.IRelationshipService;

@RestController
public class RelationshipServiceImpl implements IRelationshipService {

	@RequestMapping("/getRelationship")
	public String getRelationship() {
		String res = "Relationship A";
		return res;
	}
}
