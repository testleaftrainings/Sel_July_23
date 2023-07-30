package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();		
		//implicitly wait -->Global wait in selenium -->applicable for all the findElement/findElements
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.xpath("(/html/body/div/div[2]//form/p[1]/input)"));
		username.sendKeys("demoSalesManager");
		
		  driver.findElement(By.id("pass")).sendKeys("crmsfa");
		  
		  driver.findElement(By.className("decorativeSubmit")).click();
		 
	}

}
