package tascas101level1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringInstrument.claseCargada);
		System.out.println();
		WindInstrument flute = new WindInstrument("flute",45d);
		flute.play();
		System.out.println();
		
		Car.toBreak();
		Car car1 = new Car("Astra",200);
		car1.accelerate();
		System.out.println(car1.getBrand());
		System.out.println();
	}

}
