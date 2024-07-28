package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		// isdisplayed()
		
		//WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
	//	System.out.println("Display status of logo is : "+logo.isDisplayed());
			//boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
			//System.out.println("Display status is: "+status);
			

		//isenabled()
		
		//boolean status =driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println("enabled status is: "+status);
WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
WebElement Female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));

System.out.println("Before Selection............");

System.out.println(male_rd.isSelected());
System.out.println(Female_rd.isSelected());
	

System.out.println("after Selection of Male............");
Thread.sleep(1000);
male_rd.click();

System.out.println(male_rd.isSelected());
System.out.println(Female_rd.isSelected());
	
System.out.println("after Selection of Female............");
Thread.sleep(1000);
Female_rd.click();

System.out.println(male_rd.isSelected());
System.out.println(Female_rd.isSelected());

boolean newletterscb = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();

System.out.println("check box for NL is :"+newletterscb);



	}

}
