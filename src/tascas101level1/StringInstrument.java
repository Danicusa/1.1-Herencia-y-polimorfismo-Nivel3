package tascas101level1;

public class StringInstrument extends Instrument {
static String claseCargada = "Class StringInstrument loaded";
	
	public StringInstrument(String name, double price) {
		super(name,price);
	}
	
	public void play() {
		System.out.println("A wind instrument is playing");
		}
}
