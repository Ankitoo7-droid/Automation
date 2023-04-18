package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertBoxDemo {
	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		driver = new ChromeDriver();
		
		//maximixe it
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	}
	
	@Test
	public void closeAlertBox() throws InterruptedException {
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
}
}