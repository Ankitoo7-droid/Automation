package in.amazon.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.Mobiles;
import in.amazon.pages.SignIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyMobilePhoneSteps {
	WebDriver driver;
	Mobiles mobiles;
	
	@Given("user is on landing page of amazon")
	public void user_is_on_landing_page_of_amazon() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options); 
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		
	}

	@When("he clicks on mobile tab")
	public void he_clicks_on_mobile_tab() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickMobile();
	    
	}

	@When("he hovers the pointer over Mobile & Accessories tab")
	public void he_hovers_the_pointer_over_mobile_accessories_tab() {
		mobiles  = new Mobiles(driver);
		mobiles.hoverOverMobilesAndAccessories();
	    
	}

	@When("he clicks on Apple in Sub-menu")
	public void he_clicks_on_apple_in_sub_menu() {
	    mobiles.clickApple();
	}

	@When("he clicks on first available phone")
	public void he_clicks_on_first_available_phone() {
	    // Write code here that turns the phrase above into concrete actions
		ApplePhones applePhones = new ApplePhones(driver);
			applePhones.clickFirstPhone();
	}

	@When("he switches focus on new tab")
	public void he_switches_focus_on_new_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	}

	@When("he clicks on Buy now button")
	public void he_clicks_on_buy_now_button() {
	    // Write code here that turns the phrase above into concrete actions
	    BuyPhone buyPhone = new BuyPhone(driver);
	    buyPhone.clickBuyNowBtn();
	}

	@Then("he must able to purchase the mobile phone successfully")
	public void he_must_able_to_purchase_the_mobile_phone_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    SignIn signIn = new SignIn(driver);
		String expectedTxt = "Sign in";
		String actualTxt = signIn.getSignInTxt();
		Assert.assertEquals(actualTxt, expectedTxt);
		driver.quit();
	}

}
