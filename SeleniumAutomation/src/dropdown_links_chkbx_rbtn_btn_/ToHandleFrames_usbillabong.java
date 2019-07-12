package dropdown_links_chkbx_rbtn_btn_;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ToHandleFrames_usbillabong {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='sidebar']/aside[2]/ul/li[6]/a")).click();
		//driver.findElement(By.linkText("Menu")).click();
		
		//Click on Menu link & check it is available or not
		String title=driver.getTitle();
		String actualValue=title;
		String expectedValue="Menu";
		//Assert.assertEquals(actualValue, expectedValue);
		if (driver.findElement(By.xpath("//*[text()='Menu']")).isEnabled()) {
			System.out.println("print menu");
			
			//shift to frame 
			driver.switchTo().frame(0);
			
			//click Delphi
			driver.findElement(By.xpath("//li[@id='ui-id-5']")).click();
		
			//Click Saarland 
			driver.findElement(By.xpath("//li[@id='ui-id-7']")).click();
			
			System.out.println("ok");
		}else{
			System.out.println("fail");
		
			}
		driver.quit();
	}
	

}
