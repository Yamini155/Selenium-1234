package p1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
//		index
		driver.switchTo().frame("SingleFrame");
//		text
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Yamini");
		driver.switchTo().parentFrame();
		
//		xPath of frame link     
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
//		outer frame
		WebElement parentFrame= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(parentFrame);
//		xPath
		WebElement childFrame= driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		            driver.switchTo().frame(childFrame);
//  Enter text
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Yamini");
		
	}

}
