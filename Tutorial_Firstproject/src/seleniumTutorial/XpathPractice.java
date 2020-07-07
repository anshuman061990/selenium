package seleniumTutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEBU\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	// ----contains 
		driver.findElement(By.xpath("//button[text()='Get New User']")).click();
		System.out.println("clicked");
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//div[contains(text(),'First Name')]")).getText();
		System.out.println(text);	
		String[] str = text.split("\\n");
		System.out.println(str[2]);
		
		
		
	//---sibling
		String text2 = driver.findElement(By.xpath("//a[@href='../selenium-tutorials']//parent::li/following-sibling::li/a")).getText();
		System.out.println(text2);
		
	//----ancestor
		String text3 = driver.findElement(By.xpath("//a[@href='../selenium-tutorials']//ancestor::div[1]/h4")).getText();
		System.out.println(text3);
		
	//----child
		List <WebElement> list = driver.findElements(By.xpath("//a[@href='../selenium-tutorials']/ancestor::ul[1]/child::li"));
		
		System.out.println(list.size());
	}

}
