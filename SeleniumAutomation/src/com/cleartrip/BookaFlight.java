package com.cleartrip;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BookaFlight {
	WebDriver driver;
	
	
  @Test(description="Verify the functionality of cleartrip.com should be available")
  public void test01() {
	  driver.navigate().to("http://www.cleartrip.com/");
  }
  @Test(description="Verify the main page should be displayed")
  public void test02() {
	  String actualvalue=driver.getTitle();
	  System.out.println(actualvalue);
	  String expectedvalue="Cleartrip | Flights, Hotels, Packages, Buses, Trains";
	  Assert.assertEquals(actualvalue, expectedvalue);
	  
	  
  }
  @Test(description="Verify the functionality of Flights link")
  public void test03() {
	 if( driver.findElement(By.xpath("//a[text()='Flights']")).isEnabled()) {
		 driver.findElement(By.xpath("//a[text()='Flights']")).click();
	 }else{
		 System.out.println("Flight link should not be clicked");
	 }
  }
/*  @Test(description="Verify the functionality of Oneway radio button")
  public void test04() {
	  if(driver.findElement(By.xpath("//input[@id='OneWay']")).isSelected()) {
	     driver.findElement(By.xpath("//input[@id='OneWay']")).click();
	     System.out.println("Radio botton click");
	 } else {
		System.out.println("Radio botton should not be clicked");
	}
  }*/
  @Test(description="Verify the functionality of Roundtrip radio button")
  public void test04() {
	   if(driver.findElement(By.xpath("//input[@id='RoundTrip']")).isSelected()) {
	      driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
		  System.out.println("Roundtrip Radiobtn is selected");
		}else{
			System.out.println("Roundtrip Radiobtn is not selected");
		}
  }
  @Test(description="Verify the functionality of 'From' Textlocation")
  public void test05() throws InterruptedException {
	  if(driver.findElement(By.xpath("//input[@id='FromTag']")).isEnabled()) {
	     driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("Hyd");
	     driver.findElement(By.xpath("html/body/ul[1]/li[1]/a")).click();
	  } else {
		  System.out.println("From tag should not be filled");
	  }
  }
  
  @Test(description="Verify the functionality of 'To' Textlocation")
  public void test06() {
	  if(driver.findElement(By.xpath("//input[@id='ToTag']")).isEnabled()) {
	  driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("Hyd");
	  driver.findElement(By.xpath("html/body/ul[2]/li[1]/a")).click(); 
	  }else{
		  System.out.println("ToTag should not be filled");
	  }
  }
  
  @Test(description="verify the functionality of datepicker and select Depart 25th date")
  public void test07() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[text()='30']")).click();
	  driver.findElement(By.xpath("//input[@id='ReturnDate']")).click();
	  driver.findElement(By.xpath("//span[text()='October']/")).click();
	  //driver.findElement(By.xpath("//")).click();
  }
  
  @Test(description="Verify the functionality of Adult Dropdown and select 2Adult")
  public void test08() {
	  //WebElement adult=driver.findElement(By.xpath("//select[@id='Adults']"));
	  Select select = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
	  select.selectByIndex(2);
  }
  
  @Test(description="Verify the functionality of children Dropdown and select 2-children")
  public void test09() {
	  Select select = new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));
	  select.selectByIndex(2); 
  }
  @Test(description="Verify the functionality of infants Dropdown and select 1-Infants")
  public void test10() {
	  Select select = new Select(driver.findElement(By.xpath("//select[@id='Infants']")));
	  select.selectByIndex(1); 
  }
  @Test(description="Verify the functionality of ")
  public void test11() {
	  
  }
  
  @Test(description="Verify the functionality of ")
  public void test12() {
	  
  }
  @Test(description="Verify the functionality of ")
  public void test13() {
	  
  }
  @Test(description="Verify the functionality of ")
  public void test14() {
	  
  }




  @BeforeTest
  public void beforeTest() {
	  //Open Browser
	  driver=new FirefoxDriver();
	  //Maximize the window
	  driver.manage().window().maximize();
	  //synchronization of implicit wait
	  driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	  //close all cookies
	  driver.manage().deleteAllCookies();
	    
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
