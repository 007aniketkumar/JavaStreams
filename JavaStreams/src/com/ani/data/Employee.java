package com.ani.data;

public class Employee {

	
	public Employee(String gender,String firstName,String lastName,int id,int age) {
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}
	private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String firstName;
	private String lastName;
	private int id;
	private int age;
}
