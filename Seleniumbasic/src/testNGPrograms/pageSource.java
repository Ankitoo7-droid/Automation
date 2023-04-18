package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pageSource {

	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}
	@Test(priority=0)
	public void verifyTitle() {
	
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=1)
	public void verifyText() {
		//String expectedText = "Facebook helps you connect and share with the people in your life.";
		//String actualText = driver.findElement(By.xpath("//h2[contains(@class,'eso')]")).getText();
		//Assert.assertEquals(actualText, expectedText);
		
		boolean textStatus = driver.getPageSource().contains("Facebook helps you connect and share with the people in your life.");
		Assert.assertTrue(textStatus);
	}
	
	@Test(priority=2,enabled=false, dependsOnMethods ="verifyText")
	public void verifyLoginBtnIsBlue() {
		String expectedColor = "rgba(24,119,242,1)";
		String actualColor = driver.findElement(By.name("login")).getCssValue("background-color");
		Assert.assertEquals(actualColor, expectedColor);
		
	}
	@AfterTest
	public void closeBrowser() {
	driver.quit();
	}
}
