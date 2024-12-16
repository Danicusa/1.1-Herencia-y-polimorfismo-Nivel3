package tascas101level1ex2;

public class Car {
	
	private static final String brand = "Opel";
	private static String model;
	private final int power;
	
	public Car(String model, int power) {
	Car.model = model;
	this.power = power;
	}
	
	public String getBrand() {
		return Car.brand;
	}
	
	public static void toBreak() {
		System.out.println("The vehicle is braking");
	}
	
	public void accelerate() {
		System.out.println("The vehicle is accelerating");
	}
}
