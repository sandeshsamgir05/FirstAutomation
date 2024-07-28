package Day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethhods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		// get(URL) to launch URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				// to max the page
		
		
driver.manage().window().maximize();
		// (driver.getTitle() returns title
Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		//returm current URL getCurrentUrl()
		System.out.println(driver.getCurrentUrl());		
		// returm source code of page .getPageSource()
		//System.out.println(driver.getPageSource());
		//
		//String windowID = driver.getWindowHandle(); 
			//	System.out.println(windowID);
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click(); // this will open new window
		Set<String> windowIDs = driver.getWindowHandles();
		
		System.out.println(windowIDs);
		
	}

}
