package tascas101level2;

public class SmartPhone extends Phone implements Camera, Watch {
	public SmartPhone(String brand,String model) {
		super(brand,model);
	}
	
	public void takeAPhoto() {
		System.out.println("A photo is being taken");
	}
	
	public void alarm() {
		System.out.println("The alarm is sounding");
	}
}
