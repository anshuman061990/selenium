package seleniumTutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingPropertiesFile {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LEBU\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Properties prop = new Properties();
		
		
		
		
		
		
		
	
		File file = new File(System.getProperty("user.dir")+"\\src\\seleniumTutorial"+"\\Application.properties");
		FileInputStream stream = new FileInputStream(file);
		prop.load(stream);
		
		WebElement dragelement = driver.findElement(By.xpath(prop.getProperty("dragelement")));
		System.out.println("dragelement");
		WebElement drop = driver.findElement(By.id(prop.getProperty("dropelement")));

		System.out.println("dropelemetn");		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(dragelement, drop).build().perform();
		
		System.out.println("dragand drip pass");

	}


}
