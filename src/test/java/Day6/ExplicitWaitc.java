package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitc {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Explicit wait declaration
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		WebElement textusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		
		textusername.sendKeys("Admin");

		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	WebElement textpwd = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		
		textpwd.sendKeys("admin123");
		
		WebElement loginb = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		
		loginb.click();
		
		
	}

}
