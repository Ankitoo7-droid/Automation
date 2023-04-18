package in.swiggy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn {
	@FindBy(xpath = "//span[contains(@class,'_2EQ3T')]")
	private WebElement errMsg;
	
	public String getErrMsg() {
		return errMsg.getText();
	}
}
