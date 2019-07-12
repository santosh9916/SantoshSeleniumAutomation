
package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Flipkart {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		//driver=new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();*/
		
		System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");        
		Actions actions=new Actions(driver);
        WebElement element_Electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
        actions.moveToElement(element_Electronics).build().perform();
        
		
		
				
     	}
	}


