package gmail_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail_DD {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\Library\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUpWithoutGmail?hl=en");
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
		// method 1(Select October)
		//driver.findElement(By.xpath("//div[@id=':a']/div")).click();
		// method 2(Select October)
		driver.findElement(By.xpath("//div[text()='October']")).click();
		 


		
		

		/*
		 * Actions actions=new Actions(driver);
		 * actions.sendKeys(Keys.ARROW_DOWN); actions.sendKeys(Keys.ARROW_DOWN);
		 * actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		 */

	}

}
