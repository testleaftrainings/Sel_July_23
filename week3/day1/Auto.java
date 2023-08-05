package week3.day1;

public class Auto extends Vehicle {
	
	
	public void noOfWheels() {
		System.out.println("3 wheels");
	}

	
	public static void main(String[] args) {
		Auto au=new Auto();
		au.applybrake();
		au.soundHorn();
		au.noOfWheels();
	}
	
}
