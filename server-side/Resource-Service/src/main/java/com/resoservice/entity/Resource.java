package com.resoservice.entity;

public class Resource {

	private Long resourceId;
	private String email;
	private String resourceName;
	private String domain;

	private Long userId;

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Resource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resource(Long resourceId, String email, String resourceName, String domain, Long userId) {
		super();
		this.resourceId = resourceId;
		this.email = email;
		this.resourceName = resourceName;
		this.domain = domain;
		this.userId = userId;
	}



}
