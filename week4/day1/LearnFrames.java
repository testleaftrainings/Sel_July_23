package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// bring driver focus into frame
		driver.switchTo().frame(0);//using index
		driver.findElement(By.id("Click")).click();
		//exit from the frame to the main content page
		driver.switchTo().defaultContent();
		
		
		//Handling nested Element
		driver.switchTo().frame(2);//using index		
		driver.switchTo().frame("frame2");//using attribute		
		driver.findElement(By.id("Click")).click();
		
		//to to reach any parent frame
		driver.switchTo().parentFrame();
		
	}

}
