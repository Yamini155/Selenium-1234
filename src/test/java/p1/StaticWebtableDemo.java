package p1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebtableDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		values of table
	   List<WebElement> tableValues= driver.findElements(By.xpath("//table"));
//	   rows
	   List<WebElement>rowValues=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
	   int rowsize=rowValues.size();
	   List<WebElement>colValues=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
	   int colSize=colValues.size();
	   System.out.println("Static web table:");
	   for(int r=2;r<=rowsize;r++) {
		   for(int c=1;c<=colSize;c++) {
			   String data=driver.findElement
					   (By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]"))
					   .getText();
			   System.out.print(data + " ");
		   }
		   System.out.println();
	   }
	   
//	   is displayed
	   String bookName="Learn Java";
			Boolean book=driver.findElement(By.xpath("//td[text()='"+bookName+"']")).isDisplayed();
	   System.out.println("is book present :" + " " + book);
	   
// get price from table
	   
	   WebElement price= driver.findElement(By.xpath("//tr/td[text()='"+bookName+"']/following-sibling::td[3]"));
	   System.out.println("price of book :" + price.getText());
	   
//	   get all books by Amit
	   
	  List< WebElement> author=driver.findElements(By.xpath("//tr[td[text()='Amit']]/td[1]"));
	   for(WebElement a:author) {
		   System.out.println("author books :" + a.getText());
	   }
	   
//	  count of books by author 
	   int count = 0;

	   List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));

	   for (int i = 1; i < rows.size(); i++) {   
	       List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	       
	       String author1 = cols.get(1).getText(); 
	       
	       if (author1.equals("Mukesh")) {
	           count++;
	       }
	   }

	   System.out.println("Books by Mukesh: " + count);

	  
	   
	   
	   
	   
	}

}
