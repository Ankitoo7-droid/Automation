package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locate {

	@FindBy(xpath = "(//div[contains(@class,'_1oLDb')])[1]")
	//@FindBy(xpath = "(//button[contains(@tableindex,'2')])")
	private WebElement location;

	public Locate(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
public void clickOnLocation() {
	location.click();
}
}