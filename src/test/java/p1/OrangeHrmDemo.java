package p1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmDemo {

	public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
		
//		implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		explicit wait
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(20));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
//		open web site
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		enter user name
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		enter password
	WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("admin123");
	
//	login button using x path
	WebElement login= myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
			login.click();
//	dash board page is visible
			WebElement dashBoard = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector((".oxd-topbar-header"))));
				dashBoard.isDisplayed();
// Admin menu
				
		driver.findElement(By.xpath("//span[text()='Admin']")).click();	
		
//		text
	WebElement text=driver.findElement(By.xpath("//h5[text()='System Users']"));
	text.isDisplayed();
	
//	user name
	WebElement userName = driver.findElement(
		    By.xpath("//label[text()='Username']/ancestor::div[contains(@class,'oxd-input-group')]//input")
		);

		userName.sendKeys("Yamini");
		
//		selection
		WebElement userDropDown=driver.findElement(By.xpath("//label[text()='User Role']/ancestor::div[contains(@class,' oxd-input-field-bottom-space')]"));
		userDropDown.click();
		
		WebElement admin=driver.findElement(By.xpath("//div[contains(@class,'oxd-select-text-input') and text()='Admin']"));
		js.executeScript("arguments[0].click()", admin);
		
		
	}

}
