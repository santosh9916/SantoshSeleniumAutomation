package frame_handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames_Jquery {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		int allFrame = driver.findElements(By.tagName("iframe")).size();
		for (int i = 0; i < allFrame; i++) {
		driver.switchTo().frame(i);
		Thread.sleep(2000);
		//It will return from frame to webpage
		driver.switchTo().defaultContent();
		}
	}

}
