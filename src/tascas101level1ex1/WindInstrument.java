package tascas101level1ex1;

public class WindInstrument extends Instrument {
	
	static {
		System.out.println("The class has been loaded (subWind)");
	}
	
	public WindInstrument(String name, double price) {
		super(name,price);
	}
	
	public void play() {
	System.out.println("A wind instrument is playing");
	}
	
	static {
		System.out.println("The class has been loaded (subWind2)");
	}
	
	
	static {  
		System.out.println("WindInstrument class loaded"); 
	}

}
