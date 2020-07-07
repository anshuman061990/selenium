package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserCommands {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\LEBU\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(4,  TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.navigate().to("https://www.guru99.com/click-on-image-in-selenium.html");
//		driver.navigate().back();
		String title= driver.getTitle();
		String url= driver.getCurrentUrl();
		
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().parentFrame();
	
		System.out.println("title is "+title);
		System.out.println("url is "+url);
	
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("ANDORRA");
		select.selectByValue("ANTARCTICA");
//		select.selectByIndex(1);
	}

}
