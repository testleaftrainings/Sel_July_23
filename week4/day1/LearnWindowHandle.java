package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;



public class LearnWindowHandle {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//to get the address of the current active Window(driver has control)	
		String windowHand = driver.getWindowHandle();
		System.out.println(windowHand);
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//to get the address of the current Window
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		
		//to get the address of all the windows /tabs 
		Set<String> windowHandles = driver.getWindowHandles();		
		//System.out.println(windowHandles.size());
		
	//	
		for (String wh : windowHandles) {
			System.out.println(wh);
		}
		//convert the set into list to access the window/tab with index
		List<String> win=new ArrayList<String>(windowHandles);		
		driver.switchTo().window(win.get(1));		
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(win.get(0));		
		
	    driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
	    Set<String> winhan= driver.getWindowHandles();
	 	List<String> whandle=new ArrayList<String>(winhan);
		
		for (int i = 0; i < whandle.size(); i++) {
		String title = driver.switchTo().window(whandle.get(i)).getTitle();
	    System.out.println(title);
		//driver.close();
	    String title2 = driver.switchTo().window(whandle.get(0)).getTitle();
		System.out.println(title2);
		}
		
		
	//	driver.quit();
		
		
	}

}
