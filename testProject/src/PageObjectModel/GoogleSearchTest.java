package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PageObjectModel.GoogleSearchPage;

public class GoogleSearchTest {

        String baseUrl="https://www.google.com";
	    String driverPath="C:\\\\Users\\\\vinod\\\\Downloads\\\\chromedriver_win32\\\\Chromedriver.exe";
		private static WebDriver driver = null;
		
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launching browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}

	@Test
	public void googlesearch() throws InterruptedException {		
			driver.manage().window().maximize();	
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation");	
		Thread.sleep(1000);
		GoogleSearchPage.button_search(driver).click();
		Thread.sleep(3000);
	}

	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	    System.out.println("Test completed");
	}

	}


