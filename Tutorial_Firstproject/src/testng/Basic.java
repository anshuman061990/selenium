package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Basic {
	WebDriver driver;
  @Test
  public void verifytitle() {
	 String abc = driver.getTitle();
	 System.out.println(abc);
	 Assert.assertEquals(abc, "Welcome: Mercury Tours");
	 
	 System.out.println("assert successfull");
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEBU\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
