package com.cisco.SeleniumPro;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MultipleValidations {

	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}
	@Test
	public void verifyTitle() {
	
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void verifyText() {
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		String actualText = driver.findElement(By.xpath("//h2[contains(@class,'eso')]")).getText();
		AssertJUnit.assertEquals(actualText, expectedText);
	}
	
	@Test
	public void verifyLoginBtnIsBlue() {
		String expectedColor = "rgba(24,119,242,1)";
		String actualColor = driver.findElement(By.name("login")).getCssValue("background-color");
		AssertJUnit.assertEquals(actualColor, expectedColor);
		
	}
	@AfterTest
	public void closeBrowser() {
	driver.quit();
	}
}
