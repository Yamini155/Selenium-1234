import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExeDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		Scrolling
		js.executeScript("window.scrollBy(0,500)");
		System.out.println("scrolling performed"); 
		WebElement name=driver.findElement(By.id("name"));	
//		sendKeys
		js.executeScript("arguments[0].value='Selenium'",name);
		
//		button click
		WebElement buttonClick= driver.findElement(By.xpath("//button[@name='start']"));
		js.executeScript("arguments[0].click();", buttonClick);
		
//		alerts
		WebElement alert=driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		js.executeScript("arguments[0].click()", alert);
		
//		switch to Alert
		// switch to alert
		Alert a = driver.switchTo().alert();

		// accept alert (click OK)
		a.accept();
		
		
		

	}

}
