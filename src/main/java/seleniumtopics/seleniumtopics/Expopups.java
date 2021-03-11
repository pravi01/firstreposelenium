package seleniumtopics.seleniumtopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expopups {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\JDFUSER\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		String mainwindow = driver.getWindowHandle();
		
		 Set<String> windows = driver.getWindowHandles(); 
		 Iterator iterator=windows.iterator(); 
		 while (iterator.hasNext()) {
			 String childwindow = (String) iterator.next(); 
			 if(!mainwindow.equalsIgnoreCase(childwindow)){
				 driver.switchTo().window(childwindow);
				 driver.findElement(By.name("emailid"))
                 .sendKeys("gaurav.3n@gmail.com");                			
                 
                 driver.findElement(By.name("btnLogin")).click();
				 
			 }
			 driver.switchTo().window(mainwindow);
					 
					 }
		 
	}

}
