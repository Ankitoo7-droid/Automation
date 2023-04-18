package testNGPrograms;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
            //Open the browser
			ChromeDriver driver = new ChromeDriver ();
			//2) Maximize it
			driver.manage().window().maximize();
			// 3) Navigate to application
			driver.get ("https://letcode.in/table");
	}
	@Test
	public void verifySumOfValuesInFirestTable() {
            //Read all the prices in the different rows, add them and verify the sum is equal to total value mentioned in the last row.
			// 4.1) Get all the rows of the first table and put them in a list
			WebElement shoppingListTable = driver.findElement(By.id("shopping"));
			List<WebElement> shoppingList = shoppingListTable.findElements(By.tagName("tr"));
			int sum = 0;
			// 4.2 From each row, read all the td tags and put them in a separate list
			for (int i=1; i<shoppingList.size () ; i++) {
			WebElement row = shoppingList.get (i) ;
			List<WebElement> columns = row.findElements(By.tagName("td"));
			sum = sum + Integer.parseInt(columns.get(1).getText());
			}
			
			int expectedSum = 858;
			int actualSum = sum;
			
			Assert.assertEquals(actualSum,  expectedSum);
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}


}
