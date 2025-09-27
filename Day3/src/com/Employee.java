package com;

class Person {
	public Person() {
		this("hhhh");
		System.out.println("Person Default");
	}
	public Person(String name) {
		//this();
		System.out.println("Person Name "+name);
	}
	static {
		System.out.println("Person Static");
	}
}
public class Employee extends Person {
	
	public Employee() {
		//super("aaaa");
		System.out.println("Employee Default");
	}
	static {
		System.out.println("Employee Static");
	}
}
