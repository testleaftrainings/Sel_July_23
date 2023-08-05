package week3.day1;

public class Car extends Vehicle {
		
	public void brandName() {
		System.out.println("BMW");
	}
	
	public void applybrake() {
		
	}
	
	
	
//childclass/subclass/devried class
	
	public static void main(String[] args) {		
		
	/*
		 * Vehicle obj=new Vehicle(); obj.applybrake(); obj.soundHorn();
		 * 
		 */		 
	//creating obj for child class	 		
		Car bmw =new Car();		
		bmw.applybrake();
		bmw.soundHorn();
		bmw.brandName();
		
	}
	
	
}
