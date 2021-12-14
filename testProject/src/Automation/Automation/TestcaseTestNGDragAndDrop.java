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

public class TestcaseTestNGDragAndDrop {

    String baseUrl="http://www.jqueryui.com/droppable";
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
public void VerifyDragDrop() throws InterruptedException {		
		driver.manage().window().maximize();	
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		WebElement sourceElement=driver.findElement(By.id("draggable"));
		WebElement destElement=driver.findElement(By.id("droppable"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(sourceElement,destElement).build().perform();
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