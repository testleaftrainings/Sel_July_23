package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{

	// implemenent the feature step as selenium java script

	// Each feature step -->as java method
	// Create a normal method to represent the feature step
	/*
	 * public ChromeDriver driver;
	 * 
	 * @Given("Launch the browser") public void launchBrowser() { driver = new
	 * ChromeDriver(); }
	 * 
	 * @Given("Load the url") public void loadUrl() {
	 * driver.get("http://leaftaps.com/opentaps/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * 
	 * }
	 */

	@And("Enter the Username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);

	}

	@Given("Enter the Password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);

	}

	@When("Click on the Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("WelcomePage is dispalyed")
	public void verifyWelcomePage() {
		System.out.println(driver.getTitle());
	}

	
	@But("Error message is dispalyed")
	public void verifyErrorMeassage() {
		String errorMsg = driver.findElement(By.xpath("//p[text()='The Following Errors Occurred:']")).getText();
		System.out.println(errorMsg);
	}

	
}
