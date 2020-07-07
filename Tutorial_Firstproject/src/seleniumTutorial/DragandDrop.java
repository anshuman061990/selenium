package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEBU\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement dragelement = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[5]"));
		System.out.println("dragelement");
		WebElement drop = driver.findElement(By.id("bank"));

		System.out.println("dropelemetn");
		
		
		
		
		
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(dragelement, drop).build().perform();
		
		System.out.println("dragand drip pass");

	}

}
