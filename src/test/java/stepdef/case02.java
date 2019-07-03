package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case02 {
	WebDriver driver;
	@Given("user access the login page")
	public void user_access_the_login_page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	   driver.manage().window().maximize();
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String uname) {
	     driver.findElement(By.id("userName")).sendKeys(uname);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);   
	}

	@Then("click login")
	public void click_login() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}


}
