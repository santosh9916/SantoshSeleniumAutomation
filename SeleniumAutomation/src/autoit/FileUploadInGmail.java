package autoit;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadInGmail {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver;
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to("http://www.gmail.com/");
	Thread.sleep(3000);
	//verify page tile
	System.out.println(driver.getTitle());
	String actualvalue=driver.getTitle();
	String expectedvalue="Gmail";
	if (actualvalue.equalsIgnoreCase(expectedvalue)) {
		System.out.println("Gmail page should be opened");
	}else{
		System.out.println("Gmail page should not be opened");
	}
	
	//username field
	if (driver.findElement(By.xpath("//input[@id='Email']")).isEnabled()) {
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sbm12588@gmail.com");
		driver.findElement(By.xpath("//input[@id='next']")).click(); 
		Thread.sleep(3000);
	}else {
		System.out.println("Username field not available");
	}
	
	//password field
	if (driver.findElement(By.xpath("//input[@id='Passwd']")).isEnabled()) {
		driver.findElement(By.xpath("//input[@id='Passwd']")).clear();
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("wet127@2015");
		driver.findElement(By.xpath("//input[@id='signIn']")).click();
	}else {
		System.out.println("Username field not available");
	}
	Thread.sleep(2000);
		
	//COMPOSE MAIL
	 WebDriverWait wait=new WebDriverWait(driver, 50);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='COMPOSE']"))).click();
		//driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
     Thread.sleep(3000);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[div[span[text()='To']]]/following-sibling::td//textarea")))
		                                                          .sendKeys("sbm12588@gmail.com",Keys.TAB);
         
	       //driver.findElement(By.xpath("//td[div[span[text()='To']]]/following-sibling::td//textarea")).sendKeys("sbm12588@gmail.com",Keys.TAB);
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("QA-Automation Tester",Keys.TAB);
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//div[contains(@class,'Am Al editable')]")).sendKeys("Hi,This is Santosh ");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//div[text()='Send']")).click();
	
	
	
	
	
 }
}
