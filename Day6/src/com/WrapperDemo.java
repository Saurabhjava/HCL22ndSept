package com;

public class WrapperDemo {
	public void go(Number str) {
		System.out.println("Number");
	}
	public void go(Integer a) {
		System.out.println("Integer");
	}
	public static void main(String[] args) {
		WrapperDemo obj=new WrapperDemo();
		obj.go(null);
	}
}
