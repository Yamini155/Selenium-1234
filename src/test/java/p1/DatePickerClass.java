package p1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while(true) {
			String month=driver.findElement(By.className("ui-datepicker-month")).getText();
			String year=driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			if(month.equals("June") && year.equals("2026")) {
				break;
				
			}
			driver.findElement(By.xpath("//*[@title='Next']")).click();
			
//			for date as 10
			driver.findElement(By.xpath("//a[text()=10]")).click();
			
		}
		
		
// second date picker
		driver.findElement(By.cssSelector("input['#txtDate']")).click();
//		
		
		
		
		
		
		
		driver.quit();

	}

}
