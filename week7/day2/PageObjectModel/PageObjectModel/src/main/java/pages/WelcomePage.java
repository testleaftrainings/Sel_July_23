package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{
	
	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();
	}
	
	
	public LoginPage clickLogout(){
		
		return new LoginPage();
	}
	

}
