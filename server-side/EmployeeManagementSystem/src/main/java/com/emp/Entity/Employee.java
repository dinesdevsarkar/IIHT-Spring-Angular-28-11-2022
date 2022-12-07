package com.emp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String ename;
	private String eposition;
	private String email;
	private Integer esalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String ename, String eposition, String email, Integer esalary) {
		super();
		this.id = id;
		this.ename = ename;
		this.eposition = eposition;
		this.email = email;
		this.esalary = esalary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEposition() {
		return eposition;
	}

	public void setEposition(String eposition) {
		this.eposition = eposition;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEsalary() {
		return esalary;
	}

	public void setEsalary(Integer esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", eposition=" + eposition + ", email=" + email
				+ ", esalary=" + esalary + "]";
	}
	
	
}
