package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// driver.switchTo().frame("iframeResult");
		// button[text()='Try it']
		WebElement frameEle = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameEle);

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		driver.switchTo().alert().accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
	}

}
