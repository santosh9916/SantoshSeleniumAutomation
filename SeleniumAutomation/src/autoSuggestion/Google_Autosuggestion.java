package autoSuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class Google_Autosuggestion {
	
	

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		/*System.setProperty("webdriver.crome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();*/
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.bing.com");
		Thread.sleep(3000);
		
			
	//	((JavascriptExecutor) driver).executeScript("document.getElementById('gs_htif0').disabled = false");
		
		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium by");
		
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@id='sw_as']/div"));
		
		for (int i = 0; i < allOptions.size(); i++) {
			//String option = (allOptions.get(i)).getText();
			System.out.println(allOptions.get(i).getText());
			if (allOptions.get(i).getText().contains("selenium by ramesh")) {
				allOptions.get(i).click();
			}
			
		}
		
	}

}
