package com.cleartrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RoughWork {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
		String av=driver.getTitle();
		System.out.println(av);
		String ev="Cleartrip | Flights, Hotels, Packages, Buses, Trains";
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("Hyd");
		driver.findElement(By.xpath("html/body/ul[1]/li[1]/a")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
		select.selectByIndex(2);
		
}
}