package com.example.domain;

public class User2 {
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	private String name;
	private Integer age;
	private String address;
	
	
	@Override
	public String toString() {
		return "User2 [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	//get&set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
