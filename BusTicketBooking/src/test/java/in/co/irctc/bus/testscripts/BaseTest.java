package in.co.irctc.bus.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

		ChromeDriver driver;
		
		
		@BeforeClass
		public void launchApplication() {
//		1) Open the browser
			driver = new ChromeDriver();
			
//		2) Maximize it
			driver.manage().window().maximize();
			
//		3) Navigate to application
			driver.get("https://amazon.in");
		}
		
		@AfterClass
		private void closeBrowser() {
			// TODO Auto-generated method stub
			driver.quit();
		}
	}


