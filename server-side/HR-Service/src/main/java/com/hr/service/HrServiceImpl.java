package com.hr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.entity.HR;

@Service
public class HrServiceImpl implements IHrService {

	List<HR> list = List.of(
			new HR(1001L,"Dinesh","1231231231"),
			new HR(1002L,"Ganesh","23243424342"),
			new HR(1003L,"Suresh","34435344355"),
			new HR(1004L,"Somesh","45454545454"),
			new HR(1005L,"Rajesh","5575645656"),
			new HR(1006L,"Mahesh","7676767676"));

	@Override
	public HR getHr(Long id) {
		
		return list.stream().filter(hr -> hr.getUserId().equals(id)).findAny().orElse(null);
	}

}
