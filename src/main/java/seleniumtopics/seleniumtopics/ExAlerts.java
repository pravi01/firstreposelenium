package seleniumtopics.seleniumtopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExAlerts {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JDFUSER\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		/*
		 * // simple alert driver.get(
		 * "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 * driver.findElement(By.xpath("//input[@name='alert']")).click(); Alert alert =
		 * driver.switchTo().alert(); alert.accept();
		 */
		// alert to click on something again 
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alert = driver.switchTo().alert();
		
		String message = alert.getText();
		System.out.println(message);
		alert.accept();
		
		//driver.findElement(By.xpath("//a[text()='Save changes']")).click();
		/*
		 * Set<String> popup = driver.getWindowHandles(); Iterator
		 * iterator=popup.iterator(); while(iterator.hasNext()) {
		 * 
		 * String window = (String) iterator.next(); }
		 */
		
	}

}
