package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> phPr = new ArrayList<Integer>();
		for (int i = 0; i < phones.size(); i++) {

			String text = phones.get(i).getText();
			if (!text.isEmpty()) {
				String replaceAll = text.replaceAll(",", "");
				int pr = Integer.parseInt(replaceAll);
				phPr.add(pr);
			}
		}
		System.out.println(phPr);

		// sort any collection
		Collections.sort(phPr);
		System.out.println(phPr);
		Set<Integer> price = new LinkedHashSet<Integer>(phPr);

		if (phones.size() == price.size()) {
			System.out.println("No Duplicates");
		} else {
			System.out.println("Duplicates found");
		}

		System.out.println(price);
	}

}
