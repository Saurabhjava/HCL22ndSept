package foo;

public class Car {
	private String name;
	private ITyre tyre;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name, ITyre tyre) {
		this.name = name;
		this.tyre = tyre;
	}

	public void printCar() {
		System.out.println("Name==>" + name);
		System.out.println("Tyre Details==>" + tyre.getTyreDetails());
	}
}
