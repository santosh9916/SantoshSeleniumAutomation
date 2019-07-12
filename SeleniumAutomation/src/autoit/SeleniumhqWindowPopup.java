package autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumhqWindowPopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("http://www.seleniumhq.org/");
		driver.findElement(By.xpath("//*[text()='Download']")).click();
		Thread.sleep(3000);
		System.out.println("Click Download button");
			driver.findElement(By.linkText("2.47.1")).click();
			System.out.println(" click veersion link");
			Thread.sleep(2000);
			Runtime.getRuntime().exec("C:\\Users\\HOME\\Desktop\\AutoIt\\seleniumhqdown.exe");
			Thread.sleep(8000);
			System.out.println("Download succesfully");
//driver.quit();
	}

}
