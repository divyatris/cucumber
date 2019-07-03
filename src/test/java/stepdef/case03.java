package stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
 

public class case03 {
	WebDriver driver;
	@Given("User access the login page")
	public void user_access_the_login_page() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
	}

	@When("user enters {string} in the search box")
	public void user_enters_in_the_search_box(String h) {
		 driver.findElement(By.id("myInput")).sendKeys(h);
		 //Actions actions=new Actions(driver);
		 //actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("user clicks find button")
	public void user_clicks_find_button() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click(); 
	}

	@Then("user verifies")
	public void user_verifies() {
		String s1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4")).getText();
	    Assert.assertTrue(s1.contains("Headphone"));
	}

}
