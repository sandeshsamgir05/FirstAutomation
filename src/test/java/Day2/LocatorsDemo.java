package Day2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com");
		
		//driver.findElement(By.name("search")).sendKeys("Sandesh");
		
		//username.sendKeys("sandesh");
		
		//id
		
		//WebElement logo = driver.findElement(By.id("logo"));
		//boolean status = logo.isDisplayed();
		//boolean status = driver.findElement(By.id("logo")).isDisplayed();
				
	//System.out.println("Dispaly status " + status);
		driver.findElement(By.linkText("Phones")).click();
		
//	List<WebElement> headersLinks = driver.findElements(By.className("list-inline-item"));
	
	//System.out.println(headersLinks.size());
		
	//List<WebElement> links = driver.findElements(By.tagName("a"));
		//  System.out.println(links.size());
		
		
 		//List<WebElement> Links =driver.findElements(By.tagName("a"));
 		//System.out.println(Links.size());
		
		//List<WebElement> images = driver.findElements(By.tagName("img"));
//System.out.println(images.size());
		
		
		
	}

}
