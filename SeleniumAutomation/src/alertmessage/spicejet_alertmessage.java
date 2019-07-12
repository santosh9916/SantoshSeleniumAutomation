package alertmessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet_alertmessage {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
	        System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");		
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://spicejet.com");
			//driver.findElement(By.linkText("Desktop Site")).click();
		
		
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Bengaluru (BLR)")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("29")).click();
	new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("9 Adults");
	new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("1 Child");
	new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1 Infant");
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	Thread.sleep(6000);
	driver.switchTo().alert().accept();


	}

}
