package dropdown_links_chkbx_rbtn_btn_;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_CheckBox {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  
		   //Checking the Check Box & Validating is it selected or not
          driver.findElement(By.xpath("//*[@id='persist_box']")).click();
          if(driver.findElement(By.xpath("//*[@id='persist_box']")).isSelected())
          {
        	  System.out.println("Check Box is Selected");
          }else{
        	  System.out.println("Check Box is not Selected");
          }
	}

}
