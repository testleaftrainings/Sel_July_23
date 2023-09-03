package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class LoginTc extends ProjectSpecificMethod{
	
	@Test
	public void runLogin() {
		
		LoginPage lp=new LoginPage();
		lp.enterUsername().enterPassword().clickLogin().clickCRMSFA();
		
			
		
		/*
		 * lp.enterPassword(); lp.clickLogin();
		 * 
		 * 
		 * WelcomePage wp=new WelcomePage(); wp.clickCRMSFA();
		 */
		
		
		
		
	}
	

}
