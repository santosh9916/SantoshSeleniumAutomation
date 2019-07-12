package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_Webelement {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='onward_cal']")).click();
		
		List<WebElement> dates=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table//td"));
		int total_node=dates.size();
		System.out.println(total_node);
		
		for(int i=0; i < dates.size(); i++){
			
			String date=dates.get(i).getText();
			
			System.out.println(date);
			
			if (date.equalsIgnoreCase("25")) {
				
				dates.get(i).click();
				break;
			}
			
		}

	}

}
