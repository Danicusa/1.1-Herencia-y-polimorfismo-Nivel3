package tascas101level2ex1;

public class SmartPhone extends Phone implements Camera, Watch {
	public SmartPhone(String brand,String model) {
		super(brand,model);
	}
	@Override
	public void takeAPhoto() {
		System.out.println("A photo is being taken");
	}
	@Override
	public void alarm() {
		System.out.println("The alarm is sounding");
	}
}
