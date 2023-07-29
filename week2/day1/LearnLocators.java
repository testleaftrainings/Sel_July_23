package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//to loacte the username webelement in applln
		//SuchElementException
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");		
		//sendKeys -->to type in the textbox
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//className -->class attribute
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
		String crmTxt = crm.getText();
		System.out.println(crmTxt);
		crm.click();
		String title = driver.getTitle();//browser level verification
		System.out.println(title);
		
		
		

	}

}
