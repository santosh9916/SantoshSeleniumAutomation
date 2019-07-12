package action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_JQuery {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		/*List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());*/
		
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();
		
				
		/*//switch to frame
		driver.switchTo().frame(0);
		//Find the Draggable WebElement
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		//Find the Droppable WebElement
		WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
		//DragAndDrop operation Through Actions class
		Actions actions=new Actions(driver);
		actions.dragAndDrop(src, destination).build().perform();
		System.out.println("Operation is Successful");
		//Return to main window
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
		System.out.println("Click on Resizable");*/
		
		
		
	}

}
