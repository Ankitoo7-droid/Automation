package demo;
import java.time.Duration;
import org.openqa. selenium.By;
import org.openqa. selenium.WebElement;
import org.openqa. selenium.chrome. ChromeDriver; 
import org.openqa. selenium.interactions. Actions;
import org.openqa. selenium.support. ui. ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MouseHover {
public static void main (String[] args) throws InterruptedException {
// 1) Open the browser
ChromeDriver driver = new ChromeDriver ();
// 2) Maximize it
driver.manage().window().maximize();
// 3) Navigate to application
driver.get ("https://www.ebay.com/") ;
// 4) Hover pointer over'Sporting Goods'
WebElement sportingGoods = driver. findElement (By. linkText ("Sporting Goods") );
Actions actions = new Actions (driver);
actions.moveToElement(sportingGoods).build().perform();
WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(60));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Dumbbells")));
// 5) Click on 'Dumbbells' in the sub-menu
driver.findElement (By. linkText ("Dumbbells")) .click ();
}
}