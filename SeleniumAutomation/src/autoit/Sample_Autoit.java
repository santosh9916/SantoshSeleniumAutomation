package autoit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample_Autoit {

	public static void main(String[] args) throws Exception {
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "D:/Library/chromedriver.exe");
		webDriver=new ChromeDriver();*/
		
		driver.get("http://www.google.com");
		//webDriver.get("D:\\workspaceFinal\\SeleniumAutomation\\AutoIT\\AutoiTsample.html");
		Thread.sleep(2000);
		driver.findElement(By.id("1")).click();
		//Thread.sleep(3000);
		//driver.quit();html/body/input
		
	}

}
