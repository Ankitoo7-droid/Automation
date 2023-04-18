package demo;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class caender {
	public static void main(String[] args) {
//open the browser
	ChromeDriver driver = new ChromeDriver();
	
//maximixe it
driver.get("https://www.expedia.co.in/");
driver.findElement(By.id("d1-btn")).click();
WebElement nextMonth = driver.findElement(By.xpath("(//table[contains(@class,'date-picker')])[2]"));

List<WebElement> nextMonthRows = nextMonth.findElements(By.tagName("tr"));
	for (int i=1; i<nextMonthRows.size();i++) {
	WebElement row = nextMonthRows.get(i);
	List<WebElement> columns = row.findElements(By.tagName("button"));
	for (WebElement x : columns) {
		if(x.getAttribute("date-day").equals("12")){
			x.click();
			break;
		}
	}
	}
	}}