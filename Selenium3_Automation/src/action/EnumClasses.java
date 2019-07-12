package action;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EnumClasses {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.rightstart.com/");
		driver.findElement(By.xpath("//a[@id='navigation-top-cat-label-343']")).click();
		
		String actualValue = driver.getTitle();
		String exceptedValue="Baby Registry, Strollers, Convertible Car Seats & more - Rightstart.com";
		if (actualValue==exceptedValue) {
			System.out.println("page should be opened");
		}else{
			System.out.println("page should not be opened");
		}
		
		Actions actions=new Actions(driver);
		
		Thread.sleep(3000);
		actions.sendKeys(Keys.END).build().perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(5000);
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.ARROW_UP).build().perform();
		Thread.sleep(6000);
		actions.sendKeys(Keys.chord(Keys.CONTROL,"S")).build().perform();
		Thread.sleep(6000);
		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"s")).build().perform();
		
		Thread.sleep(5000);
		driver.close();
		
	}
	

}
