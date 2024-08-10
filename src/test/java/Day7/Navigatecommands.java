package Day7;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatecommands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to("https://www.odoo.com/");
		
		//URL myurl =new URL("https://www.odoo.com/");
		
		//driver.navigate().to(myurl);
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://www.odoo.com/");
		driver.navigate().to("https://www.sandeshblogs.shop/");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
	driver.navigate().refresh();
		
		
	}

}
