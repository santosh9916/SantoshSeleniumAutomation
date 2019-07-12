package dropdown_links_chkbx_rbtn_btn_;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_DropDown {
	
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	
//To Print all the dropdown locator and dropdwn values in a facebook login page  
	
	/*List<WebElement> dropdowns = driver.findElements(By.tagName("Select"));
	System.out.println(dropdowns.size());
	System.out.println("-------------------------------------------");
	for (int i=0; i < dropdowns.size(); i++) {
		System.out.println("Dropdown Loc is :" +dropdowns.get(i).getAttribute("name"));
		System.out.println("-------------------------------------------");
		System.out.println("Dropdown Values are :" +dropdowns.get(i).getText());
	}*/
	
    
//To Handle Dropdowns individually
	/*new Select(driver.findElement(By.xpath("//*[@id='day']"))).selectByVisibleText("12");
	new Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByVisibleText("May");
	new Select(driver.findElement(By.xpath("//*[@id='year']"))).selectByVisibleText("2000");
	System.out.println("-------------------------------------------");
	
	new Select(driver.findElement(By.xpath("//*[@id='day']"))).selectByValue("12");
	new Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByValue("May");
	new Select(driver.findElement(By.xpath("//*[@id='year']"))).selectByValue("2000");
	System.out.println("-------------------------------------------");
		
	new Select(driver.findElement(By.xpath("//*[@id='day']"))).selectByIndex(11);
	new Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByIndex(4);
	new Select(driver.findElement(By.xpath("//*[@id='year']"))).selectByIndex(5);
	System.out.println("-------------------------------------------");*/
		
	
//To print all the values in Month Dropdown
    List<WebElement>monthDropdown=new Select(driver.findElement(By.xpath("//*[@id='month']"))).getOptions();
	System.out.println(monthDropdown.size());
	for (int i=0; i < monthDropdown.size(); i++) {
		System.out.println("Month Dropdown values are :" +monthDropdown.get(i).getText());
		if (monthDropdown.get(i).getText().equalsIgnoreCase("Jul")) {
		    System.out.println("Month Dropdown values are :" +monthDropdown.get(i).getText());
			new Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByVisibleText(monthDropdown.get(i).getText());
		}	
//to print all values in month dropdowns except July
		if (!monthDropdown.get(i).getText().equalsIgnoreCase("Jul")) {
			System.out.println(monthDropdown.get(i).getText());
		}
	  }
	}
	}
