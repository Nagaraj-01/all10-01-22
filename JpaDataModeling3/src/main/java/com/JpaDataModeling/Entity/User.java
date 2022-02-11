package com.JpaDataModeling.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String role;
	private String designation;
	private String gmail;
	
	protected User() {
		
	}

	public User(String name, String role, String designation, String gmail) {
		super();
		this.name = name;
		this.role = role;
		this.designation = designation;
		this.gmail = gmail;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + ", designation=" + designation + ", gmail="
				+ gmail + "]";
	}
	
}
