package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demoSalesmanager");
	  //LoginPage lp=new LoginPage();
		//return new LoginPage();
		return this; //current class object or current variable
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	//	LoginPage lp=new LoginPage();
		return this;
	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
       // WelcomePage wp=new WelcomePage();
        return new WelcomePage();
	}

}
