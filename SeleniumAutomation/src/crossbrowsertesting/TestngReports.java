package crossbrowsertesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class TestngReports {
	 static WebDriver webDriver;
	public static void screenShot(String fileName) {
		File scrFile = ((TakesScreenshot) webDriver)
				.getScreenshotAs(OutputType.FILE);
		try {
			// Now you can do whatever you need to do with it, for example copy
			// somewhere
			FileUtils.copyFile(scrFile, new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void scripteExecution() throws InterruptedException {
		ExtentReports extentReports = ExtentReports.get(TestngReports.class);
		extentReports.init("F:\\reports\\result.html", false);
		extentReports.startTest("scripteExecution");
		 webDriver = new FirefoxDriver();
	
		 screenShot("F:\\reports\\sc1.png");
		extentReports.log(LogStatus.INFO, "firefox browser is launched");
		extentReports.attachScreenshot("F:\\reports\\sc1.png");
		webDriver.manage().window().maximize();
		extentReports.log(LogStatus.INFO, "firefox window is maximising");
		webDriver.manage().deleteAllCookies();
	
		extentReports.log(LogStatus.INFO, "deleted all cookies");
	
		webDriver.navigate().to("https://www.gmail.com");
		screenShot("F:\\reports\\sc2.png");
		extentReports.log(LogStatus.INFO, "url is enterded as https://www.gmail.com");
		extentReports.attachScreenshot("F:\\reports\\sc2.png");
		webDriver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rameshatbtech@gmail.com");
		screenShot("F:\\reports\\sc3.png");
		extentReports.log(LogStatus.INFO, "data typing action is performed on username field with testdata :rameshatbtech@gmail.com");
		extentReports.attachScreenshot("F:\\reports\\sc3.png");
		webDriver.findElement(By.xpath("//input[@id='next']")).click();
		extentReports.log(LogStatus.INFO, "clicked nnext button succesfully");
		Thread.sleep(3000);
		webDriver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("hello");

		extentReports.log(LogStatus.INFO, "data ying action is performed on password web element with testdata hello");
		

		
		Thread.sleep(3000);
		webDriver.findElement(By.xpath("//input[@id='signIn']")).click();

extentReports.log(LogStatus.INFO, "clicked nsignin button succesfully");
extentReports.endTest();
	}
	
}
