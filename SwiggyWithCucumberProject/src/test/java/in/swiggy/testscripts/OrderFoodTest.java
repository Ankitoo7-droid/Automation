package in.swiggy.testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import in.swiggy.pages.AddFood;
import in.swiggy.pages.EnterAddress;
import in.swiggy.pages.FirstRestro;
import in.swiggy.pages.Locate;
import in.swiggy.pages.SignIn;
import in.swiggy.pages.ViewCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodTest {
	WebDriver driver;
	EnterAddress enterAddress;
	Locate locate;
	FirstRestro firstRestro;
	AddFood addFood;
	ViewCart viewCart;
	SignIn signIn;
	
	@Given("user is on the landing page of Swiggy")
	public void user_is_on_the_landing_page_of_swiggy() {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options); 
			driver.manage().window().maximize();
			driver.get("https://swiggy.in");
	}

	@When("he enters an address {string} in the delivery text-box")
	public void he_enters_an_address_in_the_delivery_text_box(String string) {
		
		enterAddress = new EnterAddress(driver);
		enterAddress.enterAdd(string);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	    locate  = new Locate(driver);
		locate.clickOnLocation();
}

	@When("he clicks on first available Restaurant")
	public void he_clicks_on_first_available_restaurant() {
		
	    firstRestro = new FirstRestro(driver);
		firstRestro.firstRe();
	}

	@When("he clicks on add first available food")
	public void he_clicks_on_add_first_available_food() {
		
		addFood = new AddFood(driver);
		addFood.add();
//		addFood.confirm();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	

	@When("he clicks on view cart")
	public void he_clicks_on_view_cart() {

		viewCart = new ViewCart(driver);
		viewCart.cart();
	}

	@Then("he must be able to Order the food successfully")
	public void he_must_be_able_to_order_the_food_successfully() {
		String expectedErrMsg = "Secure Checkout";
		String actualErrMsg = signIn.getErrMsg();
		Assert.assertEquals(expectedErrMsg, actualErrMsg);
	driver.quit();
	}

}
