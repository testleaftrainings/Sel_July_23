package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {

	public CreateLeadPage enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}

	public CreateLeadPage enterfirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

		return this;
	}

	public CreateLeadPage enterlastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}

	public ViewLeadPage clickCreate() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

}
