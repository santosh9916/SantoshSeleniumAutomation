package action;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.bing.com");
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='MSN']")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("childwndow is"  +allwindows.size());
		
		Object object[]=allwindows.toArray();
		driver.switchTo().window(object[1].toString());
		
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("qtp");
		Thread.sleep(3000);
		driver.switchTo().window(object[0].toString());
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
