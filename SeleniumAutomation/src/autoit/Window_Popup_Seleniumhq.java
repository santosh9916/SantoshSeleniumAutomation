package autoit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Popup_Seleniumhq {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://docs.seleniumhq.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		driver.findElement(By.xpath("//a[text()='2.47.1']")).click();
		System.out.println("jar file is click");
		Runtime.getRuntime().exec("C:\\Users\\HOME\\Desktop\\AutoIt\\windowbasedPopupdownloadjarFileFromSeleniumhq.exe");
		Thread.sleep(50000);
		System.out.println("Downloaded jar file successfully");

	}

}
