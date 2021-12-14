package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestcaseTestNG {

    String baseUrl="http://www.edureka.co";
    String driverPath="C:\\\\Users\\\\vinod\\\\Downloads\\\\chromedriver_win32\\\\Chromedriver.exe";
	public WebDriver driver;
	
@BeforeTest
public void launchBrowser()
{
	System.out.println("Launching browser");
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.get(baseUrl);
}

@Test
public void VerifyTitle() throws InterruptedException {		
		driver.manage().window().maximize();	
		Thread.sleep(1000);
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//body/nav[1]/div[1]/a[1]/span[1]"))).build().perform();
		Thread.sleep(3000);
		builder.moveToElement(driver.findElement(By.linkText("Software Testing"))).build().perform();
		Thread.sleep(3000);
		WebElement act=driver.findElement(By.cssSelector("input.open_search_overlay"));
		builder.moveToElement(act).build().perform();
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.id("search-box"));
		builder.moveToElement(search).build().perform();
		Thread.sleep(3000);
		Action seriosOfactions;
		seriosOfactions=builder.sendKeys(act,"Selenium").keyDown(search,Keys.SHIFT).keyUp(search,Keys.SHIFT).build();
		seriosOfactions.perform();
		Thread.sleep(3000);
//		String ActualTitle="Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
//		String ExpectedTitle=driver.getTitle();
		//Assert.assertEquals(ExpectedTitle,ActualTitle);
//		driver.findElement(By.name("email")).sendKeys("geethg2005@gmail.com");
		
}

@AfterTest
public void closeBrowser()
{
	driver.close();
    System.out.println("Test completed");
}
}