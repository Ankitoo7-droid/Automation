package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFood {


	@FindBy(xpath = "(//div[contains(@class,'_1RPOp')])")
	//@FindBy(xpath = "(//button[contains(@tableindex,'2')])")
	private WebElement button;
	

	@FindBy(xpath = "(//div[contains(@class,'_3coNr)])")
	private WebElement button2;
	
	
	public AddFood(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    public void add() {
	button.click();
}
    public void confirm() {
    	button2.click();
    }
}
