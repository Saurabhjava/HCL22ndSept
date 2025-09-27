package com;

public class Main {
	public static void main(String[] args) {
		Shape s=new Circle();
		System.out.println(s.area());
		((Circle)s).draw();
		s=new Rectangle();		
		System.out.println(s.area());
		s.move();
	}
}
