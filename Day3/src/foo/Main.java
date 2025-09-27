package foo;

public class Main {

	public static void main(String[] args) {
		Car c=new Car("Honda",new MRF());
		c.printCar();
		Car c1=new Car("Honda",new JKTyre());
		c1.printCar();

	}

}
