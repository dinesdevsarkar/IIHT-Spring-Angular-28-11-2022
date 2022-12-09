package com.resoservice.service;

import java.util.List;

import com.resoservice.entity.Resource;

public interface IResourceService {
	
	public List<Resource> getResourceForUser(Long userId);

}
