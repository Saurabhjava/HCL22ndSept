package com;
class A {
	int x=10;
}
class B extends A {
	int x=20;
	public void print() {
		//System.out.println(x);
		//System.out.println(super.x);
	}
	static void display() {
		System.out.println("Display Static Method");
	}
}
public class Main {

	public static void main(String[] args) throws Exception  {
		/*
		 * Calculator cal=new Calculator(); cal.calculate(10, 0);
		 * System.out.println("End Of Main");
		 */
		//B obj=new B();
		B.display();
	}

}
