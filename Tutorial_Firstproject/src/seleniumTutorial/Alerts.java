package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEBU\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		String abc = driver.switchTo().alert().getText();
		System.out.println(abc);
		driver.switchTo().alert().sendKeys("anshuman");
		driver.switchTo().alert().accept();
		

	}

}
