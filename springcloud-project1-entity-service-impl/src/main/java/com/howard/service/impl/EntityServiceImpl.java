package com.howard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howard.service.IEntityService;
import com.howard.service.Feign.EntryServiceFeign;
import com.howard.service.Feign.RelationshipServiceFeign;

@RestController
public class EntityServiceImpl implements IEntityService {

	@Autowired
	private EntryServiceFeign entryServiceFeign;
	
	@Autowired
	private RelationshipServiceFeign relationshipServiceFeign;

	@RequestMapping("/getEntityById")
	public String getEntityById() {
		String entryInfo = null;
		entryInfo = entryServiceFeign.getEntryByName();
		String res = "Entity AAA get entry from entry service:" + entryInfo;
		return res;
	}

	@RequestMapping("/getEntityByName")
	public String getEntityByName() {
		String entityinfo = "Entity B";
		return entityinfo;
	}

	@RequestMapping("/getEntityAndReleationship")
	public String getEntityAndReleationship() {
		String relInfo = relationshipServiceFeign.getRelationship();
		String res = "Entity AAA get relationship from relationship service:" + relInfo;
		return res;
	}

}
