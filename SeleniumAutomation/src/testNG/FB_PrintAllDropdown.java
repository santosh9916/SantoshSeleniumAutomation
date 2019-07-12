package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FB_PrintAllDropdown {
	WebDriver driver;
  @Test
  public void dropDown() {
	  List<WebElement> dropdown = driver.findElements(By.tagName("Select"));
	  System.out.println("Total number of Dropdown :"+dropdown.size());
	  
	  for (int i = 0; i < dropdown.size(); i++)
	  {
		 		     //To print all Dropdown Locators
		  System.out.println("Dropdown Locators are:"+dropdown.get(i).getAttribute("name"));
		  
		             //To print all Dropdown Values
		  System.out.println("Dropdown values are:"+dropdown.get(i).getText());
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
	  driver.close();
  }

}
