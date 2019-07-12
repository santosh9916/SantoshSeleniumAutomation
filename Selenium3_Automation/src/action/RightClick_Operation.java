package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Operation {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@name='btnG']")).click();
		driver.findElement(By.xpath("//a[text()='Downloads - Selenium']"));
		driver.findElement(By.linkText("Selenium - Web Browser Automation"));
		System.out.println("click the Selenium - Web Browser Automation");
		Thread.sleep(5000);
		
		Actions actions=new Actions(driver);
		actions.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		//actions.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Actions class ok");
	}

}
