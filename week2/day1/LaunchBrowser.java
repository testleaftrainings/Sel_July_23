package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
	//launch the browser
	//WebDriverManager.edgedriver().setup();
	  ChromeDriver driver=new ChromeDriver();
	//EdgeDriver driver=new EdgeDriver();
	//FirefoxDriver
	  //to load the url 
	  driver.get("http://leaftaps.com/opentaps/control/login");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);	//java wait ->to pause the execution  
	  driver.close();
		
	}

}
