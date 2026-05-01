 package p1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
//	mouse Hover
	static public void action1(WebDriver driver) throws InterruptedException {
		WebElement pointMe=driver.findElement(By.xpath("//button[text()='Point Me']"));
		Actions action = new Actions(driver);
//		locator for mobiles
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		action.moveToElement(pointMe)
		.moveToElement(mobile)
		.build()
		.perform();
		Thread.sleep(2000);
		
	}
//	double click
	static public void action2(WebDriver driver) {
		WebElement copyText = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions action = new Actions(driver);
		action.doubleClick(copyText).perform();
		
	}
	
//	drag and drop
	public void action3(WebDriver driver) {
		WebElement dragEle= driver.findElement(By.id("draggable"));
		WebElement dropEle= driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragEle,dropEle).perform();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		ActionsDemo.action1(driver);
		ActionsDemo.action2(driver);
		ActionsDemo obj=new ActionsDemo();
		obj.action3(driver);
		
//		mouse hover action
//		WebElement pointMe=driver.findElement(By.xpath("//button[text()='Point Me']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(pointMe).perform();
//		Thread.sleep(2000);
		
//		locator for values
//		List<WebElement> options =driver.findElements(By.cssSelector(".dropdown-content"));
//		for(WebElement o:options) {
//			System.out.println(o.getText())
		
			driver.quit();
			
			
		}
	}


