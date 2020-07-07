package seleniumTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LEBU\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	//	driver.get("HTTP://NEWTOURS.DEMOAUT.COM/");
	driver.get("http://demo.guru99.com/test/radio.html");	
		driver.manage().window().maximize();
		
		
		
		
		
		
	WebElement element= driver.findElement(By.xpath("//input[@value='checkbox1']"));
	element.click();
		
		System.out.println(element.isSelected());
		if(element.isSelected()) {
			driver.findElement(By.xpath("//input[@value='checkbox2']")).click();
		}
		
		
//	 driver.findElement(By.linkText("Register here")).click();
//	 driver.findElement(By.id("email")).sendKeys("anshuman");
//	 driver.findElement(By.name("password")).sendKeys("akjkfja");
//	 driver.findElement(By.name("confirmPassword")).sendKeys("akjkajf");
//	 driver.findElement(By.name("register")).click();
//	 String abc = driver.findElement(By.xpath("//*[contains(text(),'Note: Your user name')]")).getText();
//	 System.out.println(abc);
	}
	

}
