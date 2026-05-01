package p1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadingDemo {
//	single file path
	static public void filePath1(WebDriver driver,String filePath) {
		
//		locator for single file
		
		WebElement singleFile=driver.findElement(By.id("singleFileInput"));
		singleFile.sendKeys(filePath);
		
		
//		upload single file
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
		
		
	}
	
//	multiple file paths
	static public void filePath2(WebDriver driver,String filePaths) {
		
//		locator for multiple files
		WebElement multipleFiles=driver.findElement(By.id("multipleFilesInput"));
		multipleFiles.sendKeys(filePaths);
		
//		upload multiple files
		driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
		
		
		
	}
	


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		FileUploadingDemo.filePath1(driver, "C:/Users/Admin/Desktop/f1.txt");
		FileUploadingDemo.filePath2(driver,"C:/Users/Admin/Desktop/f1.txt");
		FileUploadingDemo.filePath2(driver,"C:/Users/Admin/Desktop/f1.txt");
		
		 
		

	}

}
