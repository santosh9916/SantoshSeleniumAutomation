package windowshandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandle {
   public static void main(String[] args) {
	   WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.bing.com");
		
		String currentWindow=driver.getWindowHandle();
		System.out.println("Main Window:"+currentWindow);
		
		driver.findElement(By.xpath("//a[text()='MSN']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Total no. of windowsare:"+windows.size());
		
		Iterator<String> iterator=windows.iterator();
		while (iterator.hasNext()) {
			String wind = (String) iterator.next();
			System.out.println("Windows are:"+wind);
			
		}
}
}
