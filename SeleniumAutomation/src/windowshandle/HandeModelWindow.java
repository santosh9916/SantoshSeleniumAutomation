package windowshandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandeModelWindow {
	//Bootstrap Login (Frame)
	public static WebDriver driver;

	public static void main(String[] args) {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.goibibo.com");
		
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		
		driver.switchTo().frame("authiframe");
		
		driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("santosh123");

	}

}
