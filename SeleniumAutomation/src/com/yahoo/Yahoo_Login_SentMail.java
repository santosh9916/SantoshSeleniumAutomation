package com.yahoo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Yahoo_Login_SentMail {
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	  driver.navigate().to("https://login.yahoo.com/");
	  Thread.sleep(5000);
	  
  }
  @Test
  public void logIn() throws Exception {
	  if (driver.findElement(By.id("login-username")).isEnabled()){
		  driver.findElement(By.id("login-username")).clear();
	  	  driver.findElement(By.id("login-username")).sendKeys("sbm12588@yahoo.com");
	  	  Thread.sleep(2000);
	      driver.findElement(By.id("login-passwd")).sendKeys("BABUl@2014");
	      Thread.sleep(3000);
	      driver.findElement(By.id("login-signin")).click();
	      Thread.sleep(5000);
	  }
  }
  @Test
  public void comoseMail() throws Exception {
	  if (driver.findElement(By.id("yui_3_12_0_1_1446156019402_1304")).isEnabled()) {
		  driver.findElement(By.id("yui_3_12_0_1_1446156019402_1304")).click();
		  Thread.sleep(3000);
	  }
	  if(driver.findElement(By.xpath("//button[@id='yui_3_16_0_1_1446156257325_1873']")).isEnabled()){
		  driver.findElement(By.xpath("//button[@id='yui_3_16_0_1_1446156257325_1873']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("to-field")).sendKeys("sbm12588@gmail.com");
		  Thread.sleep(3000);
		  driver.findElement(By.id("subject-field")).sendKeys("Hi");
		  Thread.sleep(3000);
		  driver.findElement(By.id("yui_3_16_0_1_1446156257325_2663")).sendKeys("Hello");
		  Thread.sleep(3000);
		  driver.findElement(By.id("yui_3_16_0_1_1446156257325_2663")).click();
		  
	  }
		  
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
  }

}
