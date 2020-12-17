package com.howard.service.Feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.howard.service.IRelationshipService;

@FeignClient("app-relationship-sevice")
public interface RelationshipServiceFeign extends IRelationshipService{
}
