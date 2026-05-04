package p1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts2Demo {
	static public void simpleAlert(WebDriver driver) throws InterruptedException {
//		simple alert
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(20);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
	}



	
static public void timeAlert(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		
//		time alert
		driver.findElement(By.id("timerAlertButton")).click();
		Alert timAlert = wait.until(ExpectedConditions.alertIsPresent());
		timAlert.accept();
	}
	
	
	static public void confirmationAlert(WebDriver driver) throws InterruptedException {
		
//		confirmation alert
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(20);
		Alert confirmationAlert = driver.switchTo().alert();
		confirmationAlert.dismiss();
	}
	
	static public void promptAlert(WebDriver driver, String name) throws InterruptedException {
//		prompt alert
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(20);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys(name);
		promptAlert.accept();
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//explicit wait
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://demoqa.com/alerts/");
		Alerts2Demo.simpleAlert(driver);
		Alerts2Demo.timeAlert(driver, myWait);
		Alerts2Demo.confirmationAlert(driver);
		Alerts2Demo.promptAlert(driver, "Yamini");
		
		driver.quit();

	}

}
