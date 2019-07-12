package io_files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class WriteintoTextFile {
	WebDriver driver;
	
	
	File f=new File("C:\\Users\\HOME\\Desktop\\Kalu.txt");
	File f1=new File("C:\\Users\\HOME\\Desktop\\Kalu1.txt");	
	  
	
	
  /*@Test(description="To check the data is write into the file or not")
  public void test01() throws IOException {
	  FileWriter fw=new FileWriter(f);
	  fw.write("I am good boy");
	  fw.write("This is valentines day");
	  fw.close();
  }
 
*/  
	@Test(description="To print all links are display or not")
	  public void test02() throws IOException {
		FileWriter fw=new FileWriter(f);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for (int i = 0; i < allLinks.size(); i++) {
			if (!allLinks.get(i).getText().equalsIgnoreCase("")) {
				System.out.println(allLinks.get(i).getText());
				fw.write(allLinks.get(i).getText());
				
			}
			
		}
		fw.close();

	  }
	@Test(description="To check About link is working or not")
	  public void test03() throws IOException {
		FileReader fr=new FileReader(f1);
	    fr.read();
		
	  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.google.com");
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
