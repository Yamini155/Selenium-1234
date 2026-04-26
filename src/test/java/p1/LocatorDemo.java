package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
//		Launch the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000); 
		
//		enter userName
		driver.findElement(By.name("username")).sendKeys("Admin");
		
//		enter password
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
//		click on login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		dashBoard page
		Thread.sleep(2000);
		System.out.println("Home page Title"+ driver.getTitle());
		
		driver.quit();
		
		

	}

}
