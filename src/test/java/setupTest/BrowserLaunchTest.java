package setupTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println("Title of page :" + driver.getTitle());
		driver.quit();

	}

}
