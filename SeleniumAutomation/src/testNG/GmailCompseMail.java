package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailCompseMail {
	
	     WebDriver driver;
	    
	    @BeforeMethod
	    public void setUp() throws Exception {
	        driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }
	    
	    @Test
	    public void m1() throws Exception {
	        driver.get("https://www.gmail.com");
	        
	        //username
	        driver.findElement(By.id("Email")).clear();
	        driver.findElement(By.id("Email")).sendKeys("santosh.mahanty99@gmail.com");
	        driver.findElement(By.id("next")).click();
	        //Password
	        driver.findElement(By.id("Passwd")).clear();
	        driver.findElement(By.id("Passwd")).sendKeys("9206@2016");
	        driver.findElement(By.id("signIn")).click();
	        
	        
	      	//click on Compose Button       
	        WebDriverWait wait=new WebDriverWait(driver, 50);
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='COMPOSE']")));
			driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
	        Thread.sleep(3000);

	       
	      
	       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[div[span[text()='To']]]/following-sibling::td//textarea")));
	         
	       driver.findElement(By.xpath("//td[div[span[text()='To']]]/following-sibling::td//textarea")).sendKeys("sbm12588@gmail.com",Keys.TAB);
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("QA-Automation Tester",Keys.TAB);
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//div[contains(@class,'Am Al editable')]")).sendKeys("Hi,This is Santosh ");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//div[text()='Send']")).click();

	        
	       
	       
	        }
	}



