package siikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_test {

	public static void main(String[] args) throws Exception {
		WebDriver webdriver = new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.manage().deleteAllCookies();
		webdriver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			
		webdriver.get("file:///C:/Users/HOME/Desktop/webbased.html");
		Thread.sleep(2000);
		
		webdriver.findElement(By.xpath("html/body/input")).click();
		Thread.sleep(2000);
		Screen screen=new Screen();
		//Pattern image1=new Pattern("D:\\Sikuli Image\\Capture.PNG");
		//Pattern image2=new Pattern("D:\\Sikuli Image\\Capture1.PNG");
		String image1="D:\\Sikuli Image\\Capture.PNG";
		String image2="D:\\Sikuli Image\\Capture1.PNG";
		screen.type(image1, "C:\\Users\\HOME\\Desktop\\hello.txt");
		screen.click(image2);
		
		Thread.sleep(5000);
		
	}

}
