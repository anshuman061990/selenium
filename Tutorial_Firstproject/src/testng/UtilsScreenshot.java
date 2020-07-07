package testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilsScreenshot {
	
	public static void takescreenshot(String path, WebDriver driver) throws IOException {
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		TakesScreenshot screen = ((TakesScreenshot)driver);
		File srcfile = screen.getScreenshotAs(OutputType.FILE);
		File newfile = new File(path);
				FileUtils.copyFile(srcfile, newfile);


	}
}
