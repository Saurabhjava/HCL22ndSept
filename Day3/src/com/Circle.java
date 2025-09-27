package com;

public class Circle extends Shape {
	private double r=5;
	@Override
	public double area() {		
		return Math.PI*r*r;
	}
	public void draw() {
		System.out.println("Draw Circle");
	}

}
