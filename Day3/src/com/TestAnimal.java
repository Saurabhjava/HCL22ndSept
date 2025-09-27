package com;

import java.util.Scanner;

public class TestAnimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile No");
		String mobile=sc.next();
		if(!mobile.matches("\\d{10}"))
			System.out.println("Invalid Mobile");
		else
			System.out.println("MobileNo:"+mobile);
		
	}
}
