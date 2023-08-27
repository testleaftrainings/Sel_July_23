package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass{
//dependsOnMethods="packageName.classname.methodname"
	@Test(dataProvider="fetchData" ,dependsOnMethods="week6.day1.CreateLead.runCreate")
	public  void runDelete(String phno) throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));			
		WebElement lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//wait.until(ExpectedConditions.visibilityOf(lead));		
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		wait.until(ExpectedConditions.elementToBeClickable(lead));
		wait.until(ExpectedConditions.stalenessOf(lead));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(leadID)));
		lead.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
}
	
	@BeforeTest
	public void setValues() {
		filename="DLead";
	}
	
	
	

	
	
}






