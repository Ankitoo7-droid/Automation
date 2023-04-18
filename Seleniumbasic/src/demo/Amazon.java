package demo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Amazon {
	public static void main (String[] args) {
	//1) Open the browser
	ChromeDriver driver = new ChromeDriver();
	
    //2) Maximize it
	driver.manage().window().maximize();
	

	//3) Navigate to application - https://amazon.in
	driver.get("https://amazon.in");
	
	Actions actions = new Actions (driver);
	//4) Hover over 'Hello Sign in' menu and click on 'Sign in' button in the sub-menu
	WebElement helloSignIn = driver.findElement(By.id("nav-link-accountList"));
	
	actions.moveToElement(helloSignIn).build().perform();
	System.out.println("Done Mouse hover on 'Hello, signin' from Menu");
	
	//5) Hover over 'Sign in' menu and click on 'Sign in' button in the sub-menu
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		
		actions.moveToElement(signIn).build().perform();
		System.out.println("Done Mouse hover on 'signin' from Menu");
	    signIn.click();

	//6) Enter in invalid username
	driver.findElement(By.id("ap_email")).sendKeys("Ankitk7@cisco.com");
   
	
    //7) Click Continue button.
    driver.findElement(By.id("continue")).click();
	
    //8) Verify the error message - 'We cannot find an account with that email address' is displayed to the user.
    
    String actualErrMsg = driver.findElement(By.xpath("(//div[contains(@class,'a-alert-content')])")).getText();
    System.out.println(actualErrMsg);
    String expectedErrMsg = "We cannot find an account with that email address";
    
    if(expectedErrMsg.equals(actualErrMsg)) {
  	  System.out.println("Test case passed");
    }
    else {
  	  System.out.println("Test case failed");
    }
    
    //9) Close the browser
    driver.quit();
}
}
