package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
@Listeners(testng.Listener.class)
public class Annotations {
	WebDriver driver;
  @Test //(priority =1)//(groups = {"real"})
  
  public void verifytitle() {
	  Reporter.log("Verify Title");
	 String abc= driver.getTitle();
	 System.out.println("Title is " +abc);
  }
  @Test //(priority = 2)//(groups = {"not real"})
  
  public void verifyurl() {
	  Reporter.log("Verify URK");
	  String url = driver.getCurrentUrl();
	  System.out.println("URL is " +url);
  }
  @Test //(priority=3) //(groups = {"yes"})
  
  public void signon() throws InterruptedException {
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  Thread.sleep(5);
	  Reporter.log("Sign on");
	  System.out.println("Title is inside " + driver.getTitle());
	  
	  
	  
	  
	  
	  
	  
	  Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	  
	  System.out.println("assert verified");
  }
  @BeforeTest         //(groups = {"yes"})// (alwaysRun = true)
  // if we dont specify always run to true, then before test and after test methods not run when groups are included
  
  public void beforeTest(ITestContext context) {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEBU\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		context.setAttribute("driver", driver);
  }
  
//  @AfterMethod
//  	public void aftermethod(ITestResult result) {
//	  	if(ITestResult.FAILURE==result.getStatus());
//	  	try{
//		  	UtilsScreenshot.takescreenshot(driver);
//	  	}
//	  	catch(IOException e) {
//	  		e.getMessage();
//	  	}
//  	}

  @AfterTest //(groups = {"yes"})//(alwaysRun = true)
  public void afterTest() {
	  driver.quit();
  }

}
