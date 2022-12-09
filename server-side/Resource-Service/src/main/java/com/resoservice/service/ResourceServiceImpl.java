package com.resoservice.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.resoservice.entity.Resource;

@Service
public class ResourceServiceImpl implements IResourceService{
	
	
	List<Resource> list = List.of(
			new Resource(1L,"ravi@gmail.com", "Ravi", "ReactDev",1001L),
			new Resource(2L,"Savi@gmail.com", "Savi", "JavaScript",1002L),
			new Resource(3L,"Navi@gmail.com", "Navi", "Rest",1003L),
			new Resource(4L,"Gavi@gmail.com", "Gavi", "Python",1004L),
			new Resource(5L,"Satish@gmail.com", "Satish", "Java",1005L),
			new Resource(6L,"Gana@gmail.com", "Gana", "Angular",1006L),
			new Resource(7L,"Sona@gmail.com", "Sona", "React",1001L),
			new Resource(8L,"Pama@gmail.com", "Pama", "HTML",1002L),
			new Resource(9L,"Raja@gmail.com", "Raja", "Oracle",1003L),
			new Resource(10L,"Gaja@gmail.com", "Gaja", "Database",1004L)
			);

	@Override
	public List<Resource> getResourceForUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(resource -> resource.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
