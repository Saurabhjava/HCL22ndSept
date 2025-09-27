package com;

import java.util.Objects;

public class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee && this.name == ((Employee) obj).name)
			return true;
		else
			return false;
	}	
	public int hashCode() {
		return name.length();
	}
}
