package week6.day2;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test()
	public void creatLead() {
		System.out.println("Create lead is successful");
		throw new RuntimeException("Check the status of lead");
	}	
	
	
	@Test(priority =-1,dependsOnMethods={"creatLead","editLead"})
	public void deleteLead() {
		System.out.println("Delete lead is successful");
	}
	
	
	
	@Test()
	public void editLead() {
		System.out.println("Edit lead is successful");
	}
	
	
	
	
}
