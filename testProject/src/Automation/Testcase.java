package Automation;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {
	    String baseUrl="http://www.facebook.com";
	    String driverPath="C:\\\\Users\\\\vinod\\\\Downloads\\\\chromedriver_win32\\\\Chromedriver.exe";
		public WebDriver driver;

	

	@Test
	public void test() {		
		
			
			System.setProperty("webdriver.chrome.driver", driverPath);
			ChromeDriver  driver = new ChromeDriver();
			driver.get(baseUrl);
			driver.manage().window().maximize();
			driver.findElement(By.name("email")).sendKeys("geethg2005@gmail.com");
			driver.quit();
	        System.out.println("Test completed");
	}
}
   