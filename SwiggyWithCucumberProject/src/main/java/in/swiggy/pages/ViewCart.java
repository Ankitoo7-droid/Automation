package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCart {

	@FindBy(xpath = "(//a[contains(@class,'_1T-E4')])")
	
	private WebElement button3;

	public ViewCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
public void cart() {
	button3.click();
}
}
