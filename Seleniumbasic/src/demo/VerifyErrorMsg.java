package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMsg {

	  public static void main(String[] args) {
	  //1. open the browser
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://facebook.com");
      driver.findElement(By.id("email")).sendKeys("smpratik888@gmail.com");
      driver.findElement(By.id("pass")).sendKeys("xyzdfgsfcgfd");
      driver.findElement(By.name("login")).click();
      String expectedErrMsg = "The password that you've entered is incorrect.";
      String actualErrMsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
     // String actualErrMsg = driver.findElements(((WebElement) By.xpath("//div[contains(@class,'_9ay7')][1]"))).getText();
      if(expectedErrMsg.equals(actualErrMsg)) {
    	  System.out.println("Test case passed");
      }
      else {
    	  System.out.println("Test case failed");
      }
      driver.quit();
      driver.findElements(By.tagName("a"));
	  }
}
