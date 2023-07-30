package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));

		crm.click();

		String title = driver.getTitle();// browser level verification
		System.out.println(title);

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

		// handling the dropdown element
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));

		// instantiate the Select class
		Select dd = new Select(source);
		// use methods to select the option from the dd
		// dd.selectByIndex(1);
		// dd.selectByValue("LEAD_EMPLOYEE");
		dd.selectByVisibleText("Existing Customer");

		WebElement marketCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mdd = new Select(marketCamp);
		mdd.selectByIndex(3);
		Thread.sleep(2000);
		mdd.selectByValue("CATRQ_CAMPAIGNS");
		Thread.sleep(2000);
		mdd.selectByVisibleText("Pay Per Click Advertising");

		
		
		WebElement industry = driver.findElement(By.id("industryEnumId"));
        Select ind = new Select(industry);
        ind.selectByValue("Computer Software");
		// driver.findElement(By.className("smallSubmit")).click();

	}

}
