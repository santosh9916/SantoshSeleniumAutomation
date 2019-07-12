package javaprograms_interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PrintDuplicatesValuesin_String {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		Actions actions=new Actions(driver);
		Action mousehover1=actions.moveToElement(driver.findElement(By.id("ghb"))).build();
		Action mousehover2=actions.moveToElement(driver.findElement(By.id("ghb"))).build();
		Action mousehover3=actions.moveToElement(driver.findElement(By.id("ghb"))).build();
		mousehover3.perform();

	}

}
