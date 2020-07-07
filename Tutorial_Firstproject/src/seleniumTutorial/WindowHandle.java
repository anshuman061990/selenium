package seleniumTutorial;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEBU\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Click Here")).click();
		
		
		
		
		
		
		Set<String> handle = driver.getWindowHandles();
		String main = driver.getWindowHandle();
		for(String s:handle) {
			if(!main.equals(s)){
				driver.switchTo().window(s);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("anshu4star@gmail.com");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.close();
			}
			
		}
		driver.switchTo().window(main);
		String print =driver.getCurrentUrl();
		System.out.println(print);
		
	}
}
