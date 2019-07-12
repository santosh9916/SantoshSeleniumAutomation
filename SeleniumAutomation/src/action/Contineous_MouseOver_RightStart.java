package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Contineous_MouseOver_RightStart {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.rightstart.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("x-mark-icon")).click();
		Thread.sleep(3000);
		
		
		WebElement nursery = driver.findElement(By.xpath("//a[@id='navigation-top-cat-label-343']/span"));
		
		WebElement nurseryDecorAccessories = driver.findElement(By.xpath("//a[@id='navigation-top-cat-label-1017']/span"));
		
		WebElement webDecorArt = driver.findElement(By.xpath("//a[@id='navigation-top-cat-label-1018']/span"));
		
			
		Actions actions=new Actions(driver);
		
				actions.moveToElement(nursery).build().perform();
				Thread.sleep(2000);
				
				actions.moveToElement(nurseryDecorAccessories).build().perform();
				Thread.sleep(2000);
				
				actions.moveToElement(webDecorArt).click().build().perform();
				Thread.sleep(2000);
				
							
				Thread.sleep(5000);
				//driver.quit();
				

		
	


	 
	
	}

}
