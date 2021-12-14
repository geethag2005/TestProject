package Automation;

import java.util.concurrent.TimeUnit;

import javax.sql.RowSet;

import org.openqa.selenium.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test  {

	public static void main(String[] args)  {

        String baseUrl="http://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("geethg2005@gmail.com");
		driver.quit();
        System.out.println("Test completed");
        
	}

}

