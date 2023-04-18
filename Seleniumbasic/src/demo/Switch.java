package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Switch {
	public static void main(String[] args) throws InterruptedException {
//open the browser
	ChromeDriver driver = new ChromeDriver();
	
//maximixe it
driver.get("https://facebook.com");
driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
driver.findElement(By.id("Button2")).click();
Thread.sleep(2000);
driver.switchTo().alert().accept();//to click 'OK' button
driver.switchTo().alert().dismiss();//to click 'Cancel' button
}
}