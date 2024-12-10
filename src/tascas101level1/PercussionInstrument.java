package tascas101level1;

public class PercussionInstrument extends Instrument {
	
	public PercussionInstrument(String name, double price) {
		super(name,price);
	}

	public void play() {
		System.out.println("A wind instrument is playing");
		}
}
