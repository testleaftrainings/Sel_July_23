package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScenario {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		/*
		 * WebElement username = driver.findElement(By.id("username"));
		 * username.sendKeys("demoSalesManager");
		 * 
		 * // sendKeys -->to type in the textbox
		 * driver.findElement(By.id("password")).sendKeys("crmsfa");
		 */		
		
		
		List<WebElement> inputTextbox = driver.findElements(By.xpath("//input[@class='inputLogin']"));
		
		System.out.println(inputTextbox.size());
		
		inputTextbox.get(0).sendKeys("DemoSalesManager");
		inputTextbox.get(1).sendKeys("crmsfa");
		
	//	driver.findElement(By.className("decorativeSubmit")).click();
	}

}
