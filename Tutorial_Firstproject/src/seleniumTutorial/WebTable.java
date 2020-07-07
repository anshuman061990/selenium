package seleniumTutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\LEBU\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='table table-hover']/thead/tr/th"));
		
		
		for(WebElement e:columns) {
			System.out.print(e.getText()+"\t"+"\t");
			
		}
		System.out.println();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
//		System.out.println("columns: "+columns.size());
//		System.out.println(rows.size());/
		for(int i=1;i<=rows.size();i++) {
			for(int j=1;j<=columns.size();j++) {
				String text =driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text + "\t"+"\t");
				
			}
			System.out.println();
		}

	}

}
