package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEBU\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("isAgeSelected"));
		
//**clicking on webelement		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
//		js.executeScript("alert('Checkbox selected abc');");
		
		
//*** document URL domain Title
//		String URL = js.executeScript("return document.URL;").toString();
//		System.out.println("URL is "+URL);
//		String domain = js.executeScript("return document.domain;").toString();
//		System.out.println("domain is "+ domain);
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println("title is "+ title);
//		
//		js.executeScript("window.location = 'http://demo.guru99.com/'");
		
//*****scroll up and down 
		js.executeScript("window.scrollBy(0,600)");
	}
}
