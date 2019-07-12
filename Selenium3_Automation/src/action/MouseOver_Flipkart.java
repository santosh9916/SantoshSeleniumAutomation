
package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MouseOver_Flipkart {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		   
		Actions actions=new Actions(driver);
        WebElement element_Electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
        actions.moveToElement(element_Electronics).build().perform();
		
		
				
     	}
	}


