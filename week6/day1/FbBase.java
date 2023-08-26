package week6.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class FbBase {
	public ChromeDriver driver ; //global variable
	@Parameters({"url"})
	@BeforeMethod
	//url key =String url
	public void preCondition(String url) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	
	
	@AfterMethod
	public void quitBrowser() {
		driver.close();
	}
}
