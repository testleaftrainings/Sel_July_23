package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//span[text()='Show']")).click();
		// to handle the alert -bring the focus of driver to alert box
		Alert alert = driver.switchTo().alert();
		// accept -->ok button
		alert.accept();

		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		String text = alert.getText();
		System.out.println(text);
		// cancel the alert message
		alert.dismiss();

		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("vidya");
		// cancel the alert message
		Thread.sleep(3000);
		alert.dismiss();

		driver.findElement(By.xpath("(//span[text()='Delete'])")).click();
		// Sweet alert -->cannot be ignored but can be inspectable
		driver.findElement(By.xpath("(//span[text()='Yes'])")).click();

	}

}
