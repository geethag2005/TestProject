package Automation.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestcaseTestNGDragAndDrop2OnGrid {
	public static WebDriver driver;

	public static void main(String[]  args) throws MalformedURLException, InterruptedException{

 		String URL = "https://www.DemoQA.com";
 		String Node = "https://192.168.29.55:4444/wd/hub";
 		
 		ChromeOptions options = new ChromeOptions();
 		options.addArguments("disable-infobars");
 		options.setAcceptInsecureCerts(true);
 
 		//DesiredCapabilities cap = DesiredCapabilities.chrome();
 		WebDriver driver = new ChromeDriver(options);
 
 		driver.navigate().to(URL);
 		Thread.sleep(5000);
 		driver.quit();
 	}		
}