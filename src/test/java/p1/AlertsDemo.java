package p1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
	static public void alert1(WebDriver driver) throws InterruptedException {
//		simple alert
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Thread.sleep(20);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	static public void alert2(WebDriver driver) throws InterruptedException {
		
//		confirmation alert
		driver.findElement(By.xpath("//button[text()='Confirmation Alert']")).click();
		Thread.sleep(20);
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
	}
	
	static public void alert3(WebDriver driver, String name) throws InterruptedException {
//		prompt alert
		driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
		Thread.sleep(20);
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys(name);
		alert2.accept();
		
	}

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		AlertsDemo.alert1(driver);
		AlertsDemo.alert2(driver);
		AlertsDemo.alert3(driver, "Yamini");


		

	}

}
