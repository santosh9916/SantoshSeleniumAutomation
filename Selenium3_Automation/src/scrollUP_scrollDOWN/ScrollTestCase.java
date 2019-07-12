package scrollUP_scrollDOWN;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScrollTestCase {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Library\\geckodriver.exe");

		 driver=new FirefoxDriver();
		

		
	    driver.manage().window().maximize();
		
		
		 driver.get("http://jqueryui.com");
		

		
		 Thread.sleep(5000);

		// This  will scroll page 400 pixel vertical
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        
	   }

	}

