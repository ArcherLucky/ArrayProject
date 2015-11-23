package com.liuzhe.array.dataarray;
/**
 * DataArray元素模型类
 * @author liuzhe
 *
 */
public class Person {
	
	/*
	 *姓氏 
	 */
	private String firstName;
	
	/*
	 * 名字
	 */
	private String lastName;
	
	/*
	 * 年龄
	 */
	private int age;
	
	public Person() {}
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
