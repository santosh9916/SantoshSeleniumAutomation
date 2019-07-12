package autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowBasedPopup {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver webdriver = new FirefoxDriver();
	webdriver.manage().window().maximize();
	webdriver.manage().deleteAllCookies();
	webdriver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
	webdriver.get("file:///C:/Users/HOME/Desktop/webbased.html");
	Thread.sleep(2000);
	
	webdriver.findElement(By.xpath("html/body/input")).click();
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C:\\Users\\HOME\\Desktop\\AutoIT\\upload1.exe");
	Thread.sleep(5000);
	System.out.println("done");
	//webdriver.quit();

}
}
