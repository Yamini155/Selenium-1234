package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
//		verification of title
		
		String title = driver.getTitle();
		System.out.println("Title is :" + title );
		
//		verification of URL
		System.out.println("URL is :" + driver.getCurrentUrl());
		
		
//		navigation of Amazon web site
		
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(2000);
		
//		perform navigate actions
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
//		perform browser operations
		
		driver.manage().window().maximize();
		
//		closing the windows
		driver.quit();
		

	}

}
