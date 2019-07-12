package autoSuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoiBibo_From {

	public static void main(String[] args) {
		WebDriver driver;
		/*System.setProperty("webdriver.crome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();*/
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	
	}

}
