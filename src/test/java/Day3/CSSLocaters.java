package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id  tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Shirts");
		
		//tag class   tag.classname
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Pant");
		
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Kurti");
		
		
		
	}

}
