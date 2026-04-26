package p1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
//		implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		explicit wait declaration
		
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
//		open web site
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//  user name using x path
		WebElement element = driver.findElement(By.xpath("//input[@name='username']"));
		element.sendKeys("Admin");
		
//		password using cssSelector
		
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("admin123");
			
//		login button using x path
		WebElement login= myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
				login.click();
			
		
//		dash board page is visible
		WebElement dashBoard = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector((".oxd-topbar-header"))));
			boolean isVisible=	dashBoard.isDisplayed();
		System.out.println("Dashboard visible: " + isVisible);
		
//		capturing dash board text
		
		WebElement header = driver.findElement(By.cssSelector(".oxd-topbar-header-breadcrumb h6"));
		String text = header.getText();
		System.out.println("Header text: " + text);

		



		
	
		
		
		driver.quit();
	}

}
