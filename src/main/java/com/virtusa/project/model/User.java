package com.virtusa.project.model;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;
	private String cid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
}
