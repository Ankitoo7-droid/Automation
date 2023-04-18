package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("start")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'finish')]/h4")));
		
		
		String expectedText = "Hello World!";
		String actualText = driver.findElement(By.xpath("//div[contains(@id,'finish')]/h4")).getText();
		
		System.out.println(expectedText);
		System.out.println(actualText);
		
		if(expectedText.equals(actualText)) {
			System.out.println("Test case pass");
		}
		
		else {
			System.out.println("Test case failed");
			
		}
		
		driver.quit();

		
		
		
		
		
		
		
	}

}

