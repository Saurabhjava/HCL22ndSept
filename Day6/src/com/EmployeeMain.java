package com;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee("Jyoti");
		Employee e2=new Employee("Rahul");
		
		System.out.println(e1);
		System.out.println(e2);
		String s=new String("Hi");
		System.out.println(e1.equals(e2));
	}

}
