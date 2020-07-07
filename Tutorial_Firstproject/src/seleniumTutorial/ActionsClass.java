package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LEBU\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[text()='SUPPORT']"));
		Actions act = new Actions(driver);
		act.click(element).build().perform();
		
//		act.moveToElement(element).click().build().perform();;
		
		driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();
		
		
		
// if i use the same webelement defined above to perform any operation then it throws stale element reference, si used a new webelemtn to click		
		WebElement element1 = driver.findElement(By.xpath("//a[text()='SUPPORT']"));
		act.moveToElement(element1).contextClick().build().perform();
	}

}
