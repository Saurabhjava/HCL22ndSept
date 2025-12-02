package com.hackerrank.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List<Employee> li=new ArrayList<Employee>();
		li.add(new Employee(101, "X", 56000.00));
		li.add(new Employee(102, "A", 58000.00));
		li.add(new Employee(103, "C", 46000.00));
		li.add(new Employee(104, "D", 56000.00));
		li.add(new Employee(105, "Y", 36000.00));
		li.add(new Employee(106, "I", 86000.00));
		Comparator<Employee> byName=(e1,e2)->e1.getName().compareTo(e2.getName());
		Comparator<Employee> bySalary=(e1,e2)->e2.getSalary().compareTo(e1.getSalary());
		Collections.sort(li,bySalary);
		li.forEach(e->System.out.println(e));
	}
}
