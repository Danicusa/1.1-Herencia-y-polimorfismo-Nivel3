package tascas101level1ex1;

public class Main {

	public static void main(String[] args) {
		System.out.println(StringInstrument.claseCargada);
		System.out.println();
		WindInstrument flute = new WindInstrument("flute",45d);
		flute.play();
		System.out.println();
	}
}
