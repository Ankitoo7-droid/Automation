package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class FillForm {
	 public static void main(String[] args) {
		  //1. open the browser
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://letcode.in/edit");
	      driver.findElement(By.xpath("//input[contains(@placeholder,'first & last')]")).sendKeys("Ankit kumar");
	      String textOnScreen = driver.findElement(By.xpath("(//label[contains(@for,'name')])[6]")).getText();
	      System.out.println(textOnScreen);
	      driver.quit();
		  }
}