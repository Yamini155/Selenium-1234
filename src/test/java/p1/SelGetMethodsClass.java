package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelGetMethodsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
//		get title
		String title = driver.getTitle();
		System.out.println("Title is :" +title );
		
//		get currentUrl
		
		String url= driver.getCurrentUrl();
		System.out.println("Url is : " + url);
		
//		get text
		 WebElement mobileEle= driver.findElement(By.partialLinkText("Mobile"));
		 System.out.println("get text :" + mobileEle);

	}

}
