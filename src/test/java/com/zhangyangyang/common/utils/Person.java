package com.zhangyangyang.common.utils;

import java.util.Date;

public class Person {

	private String name;
	private Integer age;
	private String about;
	private String regDate;
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
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public Person(String name, Integer age, String about, String regDate) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", regDate=" + regDate + "]";
	}
	
	
	
}
