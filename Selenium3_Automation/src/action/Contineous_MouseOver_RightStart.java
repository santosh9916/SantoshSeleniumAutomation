package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Contineous_MouseOver_RightStart {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.giggle.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='x-button']/a/img")).click();
		Thread.sleep(3000);
		
		
		WebElement nursery_decor = driver.findElement(By.xpath(".//*[@id='nursery-decor']/a/span"));
		
		//WebElement nurseryDecorAccessories = driver.findElement(By.xpath("//a[@id='navigation-top-cat-label-1017']/span"));
		
		//WebElement webDecorArt = driver.findElement(By.xpath("//a[@id='navigation-top-cat-label-1018']/span"));
		
			
		Actions actions=new Actions(driver);
		
				actions.moveToElement(nursery_decor).build().perform();
				Thread.sleep(2000);
				
				/*actions.moveToElement(nurseryDecorAccessories).build().perform();
				Thread.sleep(2000);
				
				actions.moveToElement(webDecorArt).click().build().perform();
				Thread.sleep(2000);*/
				
							
				
				driver.quit();
				

		
	


	 
	
	}

}
