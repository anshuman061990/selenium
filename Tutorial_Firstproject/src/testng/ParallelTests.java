package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

@Listeners(testng.Listener.class)
public class ParallelTests {
	
  @Test //(priority =1)
  public void verifytitle() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEBU\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 String abc= driver.getTitle();
	 System.out.println("Title is " +abc);
	 driver.quit();
  }
  @Test //(priority = 2)
  public void verifyurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEBU\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String url = driver.getCurrentUrl();
	  System.out.println("URL is " +url);
	  driver.quit();
  }
  @Test //(priority=3) 
  public void signon() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEBU\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  Thread.sleep(5);
	  System.out.println("Title is inside " + driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	  
	  System.out.println("assert verified");
	  driver.quit();
  }

}
