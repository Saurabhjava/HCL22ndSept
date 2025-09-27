package com;

public class Employee {
	private int empid;
	private String name;
	private int age;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, int age) {
		this.empid = empid;
		this.name = name;
		this.age = age;
	}
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}