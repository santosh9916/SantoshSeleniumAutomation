package windowshandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tab_Handles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.bing.com");
		//For Main Window
		String mainWindow=driver.getWindowHandle();
		System.out.println("Main Window:"+mainWindow);
		
		driver.findElement(By.xpath("//a[text()='MSN']")).click();
		//all Windows stored in allWindows object
		
		ArrayList<String> allWindows = new ArrayList<String> (driver.getWindowHandles());
		
		System.out.println("Print no. of ChildWindows are:"+allWindows.size());
		
		driver.switchTo().window(allWindows.get(1));
		
		/*String win1 = allWindows.get(0);
		String win2 = allWindows.get(1);
		driver.switchTo().window(win1);
		driver.switchTo().window(win2);*/
	        
		
		driver.findElement(By.id("q")).sendKeys("selenium");
		//driver.close();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("facebook.com");
		Alert alt = driver.switchTo().alert();
		
	}

}
