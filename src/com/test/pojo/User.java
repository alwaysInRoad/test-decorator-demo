package com.test.pojo;

public class User {
	private String name;
	
	private String age;
	

	private String sex;

	public User(String name, String age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
}
