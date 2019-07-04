package stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case04 {
	WebDriver driver;
	@Given("Alex has registered into TestMeApp")
	public void alex_has_registered_into_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		   driver.manage().window().maximize();
		   driver.findElement(By.id("userName")).sendKeys("lalitha");
		   driver.findElement(By.id("password")).sendKeys("Password123"); 
		   driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("Alex search a particular product like headphones")
	public void alex_search_a_particular_product_like_headphones() {
		 driver.findElement(By.id("myInput")).sendKeys("head");
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("try to poceed to payment withoput adding any items to the cart")
	public void try_to_poceed_to_payment_withoput_adding_any_items_to_the_cart() {
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		 driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
		 String s1= driver.getTitle();
		 String s2="View Cart";
		 // SoftAssert softAssert = new SoftAssert();
		 if(s1.equals(s2)){
			 Assert.assertTrue(false);
			 
		 }
		 else{
			 Assert.assertTrue(true);
		 }
	}

	@Then("TestMeApp does not display the cart icon")
	public void testmeapp_does_not_display_the_cart_icon() {
		 //driver.get("http://10.232.237.143:443/TestMeApp/displayCart.htm");
		   
	     
	}

}
