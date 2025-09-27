package com;

public abstract class Animal {
	public Animal() {
		System.out.println("Cons! Animal");
	}
	public abstract void eat(); 
	public void m1() {
		
	}
}
 class Dog extends Animal {
	public Dog() {
		System.out.println("Cons! Dog");
	}
	public void bark() {
		System.out.println("Dog Bark...");
	}

	@Override
	public void eat() {
		System.out.println("Dog Eat");		
	}
}
