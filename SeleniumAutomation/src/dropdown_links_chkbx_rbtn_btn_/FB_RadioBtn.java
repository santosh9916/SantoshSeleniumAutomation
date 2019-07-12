package dropdown_links_chkbx_rbtn_btn_;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_RadioBtn {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		            //To Handle Radio Button
		  driver.findElement(By.xpath("//*[@id='u_0_e']")).click();
		  if(driver.findElement(By.xpath("//*[@id='u_0_e']")).isSelected())
		  {
			  System.out.println("Radio Botton is Selected");
		  }else{
			  System.out.println("Radio Botton is not Selected");
		  }
	}

}
