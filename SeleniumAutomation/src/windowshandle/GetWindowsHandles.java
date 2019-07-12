package windowshandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowsHandles {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.bing.com");
		//For Main Window
		String mainWindow=driver.getWindowHandle();
		System.out.println("Main Window:"+mainWindow);
		
		driver.findElement(By.xpath("//a[text()='MSN']")).click();
		//all Windows stored in childWindows object
		Set<String> childWindows = driver.getWindowHandles();
		System.out.println("Print no. of ChildWindows are:"+childWindows.size());
		
		                 //Using iterator
		
		Iterator<String> iterator=childWindows.iterator();
		while (iterator.hasNext()) {
			String windows = iterator.next();
			System.out.println("iterator windows are:"+windows);
			if (!mainWindow.equalsIgnoreCase(windows)) {
				driver.switchTo().window(windows);
				Thread.sleep(3000);
				driver.findElement(By.id("q")).sendKeys("selenium");
			}}
			
			        //Using for-each Loop
		/*
		for (String windows : childWindows) {
			if (mainWindow.equalsIgnoreCase(windows)) {
				System.out.println("Already Selenium focus on main window");
			}else{
				driver.switchTo().window(windows);
				Thread.sleep(3000);
				driver.findElement(By.id("q")).sendKeys("selenium");
				System.out.println("Typed selenium on MSN Window");
			}}*/
		
		                //Using Object Array
		
		/*Object s[]=childWindows.toArray();
		driver.switchTo().window(s[1].toString());
		
		driver.findElement(By.id("q")).sendKeys("Selenium");
		System.out.println("Typed selenium on MSN Window");*/
	
	}

}
