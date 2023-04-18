package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ButtonSelection {
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/radio");
	
		driver.findElement(By.id("yes")).click();

		boolean barRadioBtnStatus = driver.findElement(By.id("notfoo")).isSelected();
		
		if(barRadioBtnStatus) {
		
			System.out.println("Bar Radio button is selected by default");
		
		}
		else {
		
			System.out.println("Bar Radio button is not selected by default");
		
		}
		
		boolean rememberMeCheckBox = driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[1]")).isSelected();
		
           if(rememberMeCheckBox) {
        
        	   System.out.println("Check box is selected by default");
   		
           }
   		
           else {
   			
        	   System.out.println("C is not selected by default");
   		
           }
           
           driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();

       	driver.quit();      		
	}
	}