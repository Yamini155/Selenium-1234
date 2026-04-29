package p1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DatePickerClass {
//	first date picker
	static public void selectDate(WebDriver driver,String year,String month,String date) {
		while(true) {
			String monthEle=driver.findElement(By.className("ui-datepicker-month")).getText();
			String yearEle=driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			if(monthEle.equals(month) && yearEle.equals(year)) {
				break;
				
			}
		
			driver.findElement(By.xpath("//*[@title='Next']")).click();
		}
		
//		select all dates
		List<WebElement>dateValues=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for(WebElement dates:dateValues) {
			if(dates.getText().equals(date)) {
				dates.click();
				break;
			}
			
			
		}
			
//			for date as 10
//			driver.findElement(By.xpath("//a[text()=10]")).click();
			
	}
	
//	second date picker
	
	static public void selectDate1(WebDriver driver,String year,String month,String date) {
			WebElement dropdown1= driver.findElement(By.className("ui-datepicker-month"));
			Select select =new Select(dropdown1);
			select.selectByContainsVisibleText(month);
			
			WebElement dropdown2= driver.findElement(By.className("ui-datepicker-year"));
			Select select1 =new Select(dropdown2);
			select1.selectByContainsVisibleText(year);
			
//			select dates
			List<WebElement>datevalues1= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
			for(WebElement d:datevalues1) {
				if(d.getText().equals(date)) {
					d.click();
					break;
				}
			}
	}
	
//	third date picker
	static public void selectDates(WebDriver driver,String year, String month,String date) {
		
	}
	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		first date picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		selectDate(driver,"2026","June","10");
				
		
// second date picker
		WebElement datePic = myWait.until(
			    ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'txtDate\']")));
		datePic.click();
		selectDate1(driver,"2025","May","15");
		
//		another way
//		String month= "Aug";
//		String year= "2024";
//		
//		
//			
//			WebElement dropdown1= driver.findElement(By.className("ui-datepicker-month"));
//			Select select =new Select(dropdown1);
//			select.selectByContainsVisibleText(month);
//			
//			WebElement dropdown2= driver.findElement(By.className("ui-datepicker-year"));
//			Select select1 =new Select(dropdown2);
//			select1.selectByContainsVisibleText(year);
			
// third date picker
		WebElement datePicker = myWait.until(
			    ExpectedConditions.elementToBeClickable(By.className("date-picker-box")));
		datePicker.click();
		
		
			
		}
		
		
		
		
		
	
}
