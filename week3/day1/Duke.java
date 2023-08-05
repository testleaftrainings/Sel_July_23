package week3.day1;

public class Duke extends LearnMethodOverriding{

	public int brakeSystem(int a) {
		System.out.println("Abs brake system : " +a);
		return a;
	}
	
	public void brakeSystem() {
		super.brakeSystem();// to call the parent class method which is overridden in child class
		System.out.println("Abs brake system");
	}
	
	
	public static void main(String[] args) {
		
		Duke bike=new Duke();
		bike.brakeSystem();
		bike.brakeSystem(125);
		
	}

}
