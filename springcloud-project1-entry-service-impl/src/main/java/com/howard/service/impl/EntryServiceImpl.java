package com.howard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howard.service.IEntryService;
import com.howard.service.feign.EntityServiceFeign;


@RestController
public class EntryServiceImpl implements IEntryService{

	@Autowired
	private EntityServiceFeign entityServiceFeign;
	
	@RequestMapping("/getEntryById")
	public String getEntryById() {
		String entityInfo = null;
		entityInfo = entityServiceFeign.getEntityByName();
		String res="Entry AAA get Entity from server entity" + entityInfo;
		return res;
	}
	
	@RequestMapping("/getEntryByName")
	public String getEntryByName() {
		String entryInfo = "getEntry B";
		return entryInfo;
	}
}
