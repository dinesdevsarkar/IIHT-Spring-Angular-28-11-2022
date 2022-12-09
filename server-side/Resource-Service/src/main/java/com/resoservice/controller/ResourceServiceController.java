package com.resoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resoservice.entity.Resource;
import com.resoservice.service.IResourceService;

@RestController
@RequestMapping("/resource")
public class ResourceServiceController {
	
	@Autowired
	private IResourceService resourceService;
	
	
	@GetMapping("/hr/{userId}")
	public List<Resource> getResourceByUserId(@PathVariable Long userId) {
		return this.resourceService.getResourceForUser(userId);
	
	}

}
