package com.howard.service.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.howard.service.IEntityService;

@FeignClient("app-entity-sevice")
public interface EntityServiceFeign extends IEntityService {

}
