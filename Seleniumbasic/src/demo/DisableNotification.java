package demo;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.chrome.ChromeOptions;
public class DisableNotification{
public static void main (String[] args) {
ChromeOptions options = new ChromeOptions () ;
options. addArguments ("--disable-notifications");
// 1) Open the browser
ChromeDriver driver = new ChromeDriver(options) ;
// 2) Maximize it
driver.manage().window().maximize() ;
// 3) Navigate to application
driver.get ("https: //ndtv.com/") ;
}
}