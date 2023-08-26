package week6.day1;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLeadCB extends CrossBrowserFunality{

	@Test //acting as main method for the execution
	public void runCreate() {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		
}
}






