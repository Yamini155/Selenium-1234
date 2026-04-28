package p1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropdown1= driver.findElement(By.id("country"));
		Select select =new Select(dropdown1);
		String[] countries = {"India", "Canada","United Kingdom"};
//		select.selectByVisibleText("India");
//		select.selectByVisibleText("Canada");
		
		for(String country: countries) {
			select.selectByVisibleText(country);
			
	}
		

		WebElement dropdown2= driver.findElement(By.cssSelector("#colors"));
		Select select1 =new Select(dropdown2);
		System.out.println(select1.isMultiple());
		
//		one way
		String[]colors = {"Red", "Blue","Green"};
		for(String color: colors) {
			select1.selectByVisibleText(color);
		
	}
		
//		second way
		
		for(int i=0;i<=3;i++) {
			select1.selectByIndex(i);
			
		}
		
//		third way
		List<WebElement>options=select1.getOptions();
		for(WebElement option:options) {
			if(option.getText().equals("Green")||option.getText().equals("White")) {
				option.click();
			}
			
			
			
		}

	
	}

}
