package com.howard.service.Feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.howard.service.IEntryService;

@FeignClient("app-entry-sevice")
public interface EntryServiceFeign extends IEntryService {

}
