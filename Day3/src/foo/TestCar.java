package foo;

class Animal {
	public void eat() {
		System.out.println("Animal Eat");
	}
}
class Dog extends Animal {
	public void eat() {
		System.out.println("Dog Eat");
	}
	public void bark() {
		System.out.println("Dog Bark");
	}
}
class Cat extends Animal {
	public void eat() {
		System.out.println("Cat Eat");
	}
	public void meow() {
		System.out.println("Cat Meow");
	}
}
public class TestCar {

	public static void main(String[] args) {		
		Animal animals[]= {new Animal(),new Dog(), new Cat()};
		for(Animal a:animals) {
			a.eat();
			if(a instanceof Dog)
				((Dog)a).bark();
			if(a instanceof Cat) 
				((Cat)a).meow();
		}
	}

}
