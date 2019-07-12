package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	static WebDriver driver;
	public static void main(String[] args) throws  Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\HOME\\Desktop\\desktopapp.html");
		Thread.sleep(3000);
		driver.findElement(By.id("1")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\HOME\\Desktop\\AutoIt.exe");

	}

}
