package com.wlxy.entity;

public class User {
	private String Id;
	private int age;
	private String username;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User(String id, int age, String username) {
		super();
		Id = id;
		this.age = age;
		this.username = username;
	}
	
	
	
}
