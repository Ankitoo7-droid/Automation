package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterAddress {

	@FindBy(id = "location")
	private WebElement txtBox;
	
	public EnterAddress(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	public void enterAdd(String email) {
		txtBox.sendKeys(email);
	}
}
