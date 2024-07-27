package day1;



import org.openqa.selenium.chrome.ChromeDriver;	


public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opencart.com");
		
		String act_title = driver.getTitle();
		if (act_title.equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
				
		driver.close();
		
	}

}
