package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragOperation_JQuery {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		//switch to frame
		driver.switchTo().frame(0);
		//Find the WebElement
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		//Drag the operation move to side Through Actions class
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(src, 130, 140).build().perform();
		
	}

}
