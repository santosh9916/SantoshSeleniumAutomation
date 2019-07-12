package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {
	WebDriver driver;
	
	public void openURL(){
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
	}
	public void logIn(){
		driver.findElement(By.xpath("//*[@id='Email']")).clear();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("santoshdas7097@gmail.com");
		driver.findElement(By.xpath("//*[@id='next']")).click();
		
		driver.findElement(By.xpath("//*[@id='Passwd']")).clear();
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("7097508537");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	}
	
public static void main(String[] args) {
	GmailLogin gmailLogin=new GmailLogin();
	gmailLogin.openURL();
	gmailLogin.logIn();
	}
}
