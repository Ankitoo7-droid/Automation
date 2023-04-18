package in.co.irctc.bus.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

		//this a page class. It represent the landing page of the web-application.
		//In a apge class, we write the locators of the web-elements we wantto interact with.
		
		Actions actions;
		
		@FindBy(id = "departFrom")
		private WebElement sourceCity;
		
				
		public LandingPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			actions = new Actions(driver);
		}
		
		public void enterSourceCity() throws InterruptedException {
			sourceCity.sendKeys("Bangalore");
			Thread.sleep(2000);
			actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		}
}