package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hr.entity.HR;
import com.hr.service.IHrService;

@RestController
@RequestMapping("/hr")
public class HrController {
	
	@Autowired
	private IHrService hrService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public HR getHr(@PathVariable("userId") Long userId) {
		HR hr = this.hrService.getHr(userId);
		List resources = this.restTemplate.getForObject("http://resource-service/resource/hr/"+userId, List.class);
		hr.setResource(resources);
		return hr;
	}

}
