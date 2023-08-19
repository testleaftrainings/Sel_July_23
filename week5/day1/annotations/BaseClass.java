package annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseClass {

	public ChromeDriver driver ; //global variable
	
	@BeforeMethod
	public void preCondition() {
		System.out.println(Thread.currentThread().getId());

		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}			

	
	  @AfterMethod public void postcondition() {
		  driver.close(); 
		  }
	 
	@BeforeSuite
	public void cloudConnection() {
		System.out.println("Start cloud connection");
	}
	
	
	
	@BeforeClass
	public void testData() {
		System.out.println("Set the values");
	}
	
	
}
