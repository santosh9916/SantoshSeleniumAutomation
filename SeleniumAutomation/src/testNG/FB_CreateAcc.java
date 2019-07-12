package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FB_CreateAcc {
	WebDriver driver;
  @Test
  public void f() {
	    
	    String actualValueTitle=driver.getTitle();
		String expecedValue="Facebook login page should be opened";
		if(actualValueTitle.equalsIgnoreCase(expecedValue))
		{
			if(driver.findElement(By.xpath("u_0_1")).isEnabled())
			{
				driver.findElement(By.xpath("//*[@id='u_0_1']")).sendKeys("Santosh");
				driver.findElement(By.xpath("//*[@id='u_0_3']")).sendKeys("Mohanty");
				driver.findElement(By.xpath("//*[@id='u_0_5']")).sendKeys("9700702215");
				driver.findElement(By.xpath("//*[@id='u_0_8']")).sendKeys("9700702215");
				driver.findElement(By.xpath("//*[@id='u_0_a']")).sendKeys("9700702215@2015");
				new Select(driver.findElement(By.xpath("//*[@id='day']"))).selectByVisibleText("12");
				new Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByVisibleText("May");
				new Select(driver.findElement(By.xpath("//*[@id='year']"))).selectByVisibleText("1990");
			}
		}
  }

  @BeforeTest
  public void beforeTest() {
	    driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
