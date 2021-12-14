package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestcaseTestNG2CrossBrowser {

    String baseUrl="http://www.edureka.co";
    //String driverPath="C:\\\\Users\\\\vinod\\\\Downloads\\\\chromedriver_win32\\\\Chromedriver.exe";
	public WebDriver driver;
	
@BeforeTest
@Parameters("browser")
public void setUp(String browser) throws Exception
{
	if(browser.equalsIgnoreCase("firefox"))
	{
		String driverPath="C:\\\\Users\\\\vinod\\\\Documents\\\\geckodriver-v0.30.0-win32\\\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{		
    String driverPath="C:\\\\Users\\\\vinod\\\\Downloads\\\\chromedriver_win32\\\\Chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	}
}

//public void launchBrowser()
//{
//	System.out.println("Launching browser");
//	//System.setProperty("webdriver.chrome.driver", driverPath);
//	driver.get(baseUrl);
//}

@Test
public void VerifyTitle() throws InterruptedException {	
	driver.get(baseUrl);
		driver.manage().window().maximize();
		String ActualTitle="Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		String ExpectedTitle=driver.getTitle();
		Assert.assertEquals(ExpectedTitle,ActualTitle);
//		driver.findElement(By.name("email")).sendKeys("geethg2005@gmail.com");
		Thread.sleep(1000);
}

@AfterTest
public void closeBrowser()
{
	driver.close();
    System.out.println("Test completed");
}
}