package week3.day2;

public class LearnString {

	public static void main(String[] args) {
	
		
		//String is immutable class
		//String -Sequence of characters
		//Literal Declaration
		String comName="Testleaf";		
		String s="Testleaf";
		
		
		
		//Instantiation /using object
		String cNmae=new String("Testleaf");
		String c=new String("Testleaf");
		
		//declaration deferrentiated  with respect to memory allocation
		//== compares the memory allocation string values
		if(comName==s) {
			System.out.println("String lit Values are same");
		}else {
			System.out.println("String lit Values are not same");
		}
		
		
		if(cNmae==c) {
			System.out.println("String ob Values are same");
		}else {
			System.out.println("String ob Values are not same");
		}
		
		
		if(cNmae.equals(c)) {
			System.out.println("String ob values are equals");
		}else {
			System.out.println("String ob Values are not same");
		}
		
		

		if(cNmae.equalsIgnoreCase("testleaf")) {
			System.out.println("String ob values are equals");
		}else {
			System.out.println("String ob Values are not same");
		}
		
		
		
		
		

	}

}
