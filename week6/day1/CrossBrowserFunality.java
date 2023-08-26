package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CrossBrowserFunality  {

	/*
	 * public ChromeDriver driver ; //global variable public EdgeDriver driver;
	 */
	
	public RemoteWebDriver driver;
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	//url key =String url
	public void preCondition(String browser,String url,String username,String password) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
		 driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge"))
		{
		 driver=new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		
		
		/*
		 * driver1.manage().window().maximize(); driver1.get(url);
		 * driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * driver1.findElement(By.id("username")).sendKeys(username);
		 * driver1.findElement(By.id("password")).sendKeys(password);
		 * driver1.findElement(By.className("decorativeSubmit")).click();
		 * driver1.findElement(By.linkText("CRM/SFA")).click();
		 * driver1.findElement(By.linkText("Leads")).click();
		 */


	}	
	
	
	
	  @AfterMethod
	  public void postcondition() { 
		  driver.close(); 
		  }
	 
	 
	
	
}
