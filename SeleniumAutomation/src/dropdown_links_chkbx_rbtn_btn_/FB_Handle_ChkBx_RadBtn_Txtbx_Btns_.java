package dropdown_links_chkbx_rbtn_btn_;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_Handle_ChkBx_RadBtn_Txtbx_Btns_ {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		List<WebElement> str=driver.findElements(By.tagName("input"));
		 System.out.println(str.size());
		 for (int i = 0; i < str.size(); i++)
		 {
			 if (str.get(i).getAttribute("type").equalsIgnoreCase("text"))
			 {
				 System.out.println("TextBox Loc is:" +str.get(i).getAttribute("name"));
			 }
			 else{
			 if (str.get(i).getAttribute("class").equalsIgnoreCase("log"))
			 {
				System.out.println("Botton Loc is:"+str.get(i).getAttribute("value"));
             }
			 else{
                   if (str.get(i).getAttribute("type").equalsIgnoreCase("radio"))
           	     {
        		   System.out.println("RadioBotton Loc is:"+str.get(i).getAttribute("id"));
           	     }
                   else{
     		             if (str.get(i).getAttribute("type").equalsIgnoreCase("checkbox"))
       		           {
       			System.out.println("CheckBox Loc is:"+str.get(i).getAttribute("id"));
			 }
			}
           }
		  }
		 }
	    }
       }
