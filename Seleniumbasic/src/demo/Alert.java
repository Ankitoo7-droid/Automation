package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Alert {
	public static void main(String[] args) throws InterruptedException {
//open the browser
	ChromeDriver driver = new ChromeDriver();
	
//maximixe it
driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
driver.findElement(By.id("Button2")).click();
Thread.sleep(2000);
driver.switchTo().alert().accept();//to click 'OK' button
driver.switchTo().alert().dismiss();//to click 'Cancel' button
}
}