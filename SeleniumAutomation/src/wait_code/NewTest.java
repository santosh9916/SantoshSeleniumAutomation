package wait_code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class NewTest {
	

public WebDriver driver=new FirefoxDriver();


	@Test
	public void test(){

	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)

	                                                        .pollingEvery(5, TimeUnit.SECONDS)

	                                                        .ignoring(NoSuchElementException.class);
	
	    wait.until(new Function<WebDriver, WebElement>() {

		@Override
		public WebElement apply(WebDriver arg0) {
			
			return null;
		}
	});

	 

	   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

	     public WebElement apply(WebDriver driver) {

	       return driver.findElement(By.id("Element"));

	     }

	   });
   }
}
