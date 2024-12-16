package tascas101level1ex2;

public class Main {

	public static void main(String[] args) {
		Car.toBreak();
		Car car1 = new Car("Astra",200);
		car1.accelerate();
		System.out.println(car1.getBrand());
		System.out.println();
	}

}
