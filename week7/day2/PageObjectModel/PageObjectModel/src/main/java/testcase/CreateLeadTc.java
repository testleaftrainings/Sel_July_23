package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTc extends ProjectSpecificMethod{

	@BeforeTest
	public void setValues() {
		filename="Lead";
	}
	
	
	@Test(dataProvider ="fetchData")
	public void runCreate(String cname,String fname,String lname) {
		new LoginPage().enterUsername().enterPassword().clickLogin().clickCRMSFA()
		.clickLeads().clickCreateLead().enterCompanyName(cname).enterfirstName(fname)
		.enterlastName(lname).clickCreate() .verifyfirstName();
		
	}
	
}
