package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));

		
		WebElement dayDropDown = driver.findElement(By.id("day"));
		
		Select select = new Select(dayDropDown);
		
		select.selectByVisibleText("15");
		
        WebElement monthDropDown = driver.findElement(By.id("month"));
		
		Select selectMonth = new Select(monthDropDown);
		
		selectMonth.selectByVisibleText("Aug");
		
		WebElement YearDropDown = driver.findElement(By.id("year"));
		
		Select selectYear = new Select(YearDropDown);
		
		selectYear.selectByVisibleText("1947");
		
		
		
		
		
		
		
		

		}

}