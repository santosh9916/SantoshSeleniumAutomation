package autoSuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjaxControl {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		/*System.setProperty("webdriver.crome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();*/
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		
			
	//	((JavascriptExecutor) driver).executeScript("document.getElementById('gs_htif0').disabled = false");
		driver.findElement(By.xpath("//a[text()='×']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium by");
		String str=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]")).getText();
		System.out.println(str);

	}

}
