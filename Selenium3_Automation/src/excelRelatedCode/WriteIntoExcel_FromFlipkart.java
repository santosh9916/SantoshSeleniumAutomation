package excelRelatedCode;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class WriteIntoExcel_FromFlipkart {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//a[text()='Log In']")).click();
	  WebElement username = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input"));
	  WebElement password = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input"));
	  WebElement submit = driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button"));
	  
	  File file= new File(".\\src\\excelRelatedCode\\WriteIntoExcel_FromFlipkart.xls");
	  
	  
	  
	  

	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Library\\geckodriver.exe");
	  driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.get("http://www.flipkart.com");
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
