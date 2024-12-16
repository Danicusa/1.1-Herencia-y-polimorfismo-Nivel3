package tascas101level1ex1;

public abstract class Instrument {
	private String name;
	private double price;
	
	static {
		System.out.println("The class has been loaded (super)");
	}
		
	public Instrument (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	abstract void play();
	
	static {
		System.out.println("The class has been loaded (super2)");
	}
}
