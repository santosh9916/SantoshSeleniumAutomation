package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FB_HandleChkBx_RadBtn_Drpdwn {
	 WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("")).click();
  }
  @BeforeTest
  public void beforeTest() {
	    driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/");
		
		
  }

  @AfterTest
  public void afterTest() {
  }

}
