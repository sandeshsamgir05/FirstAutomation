package day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();{
		// TODO Auto-generated method stub
	//
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("men");
		
	 // xpath with text()
		
		boolean dispstat = driver.findElement(By.xpath("//h2[text() = 'Welcome to our store']")).isDisplayed();
		System.out.println(dispstat);
		
		String textv = driver.findElement(By.xpath("//h2[text() = 'Welcome to our store']")).getText();
		
		System.out.println(textv);
		
		
	}

}
}

