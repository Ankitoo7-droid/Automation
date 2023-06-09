package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://simplilearn.com");
    	String expectedTitle = "Simplilearn | Online Courses - Bootcamp & Certification Platform";
    	String actualTitle = driver.getTitle();
    	if(expectedTitle.equals(actualTitle)) {
    		System.out.println("Test Case Passed");
    	}
    	else {
    		System.out.println("Test Case Failed");
    	}
    	driver.quit();
    }
}
