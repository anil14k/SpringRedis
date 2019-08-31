package com.service;

import java.io.Serializable;

public class User implements Serializable{
	
	private String name;
	private String dept;
	private String id;
	public User(String name, String dept, String id, String manager) {
		super();
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.manager = manager;
	}
	private String manager;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}

}
