package com.patient.response;

import org.springframework.data.rest.core.config.Projection;

import com.patient.entity.ERole;
import com.patient.entity.User;


@Projection(types = { ERole.class, User.class })
public interface AuthorResponse {

	Integer getId();

	ERole getName();
	
	String getUsername();
	Integer getUserId();

}
