package com.hackerrank.sample;

public class Employee {  //implements Comparable<Employee>{
	private int empid;
	private String name;
	private Double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int empid, String name, Double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	/*
	 * @Override public int compareTo(Employee o) {
	 * 
	 * return this.name.compareTo(o.name); }
	 */
	
	
}
