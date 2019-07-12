package dropdown_links_chkbx_rbtn_btn_;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_PrintAllLinks {
	public static void main(String[] args) {
		int enabledLinks=0;
		int disabledLinks=0;
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  System.out.println("Total no of links are:"+links.size());
		 /* for (int i = 0; i < links.size(); i++) {
			  System.out.println("Links Values are:" +links.get(i).getText());
			  System.out.println("Attributes links are:"+links.get(i).getAttribute("classname"));
			  if(links.get(i).isEnabled()) {
				  enabledLinks++;
				  System.out.println("No of working links are :"+enabledLinks);
			}else{
				disabledLinks++;
				System.out.println("No of disabled links are:"+disabledLinks);
			}
		}*/
		  
		  Iterator<WebElement> itr=links.iterator();
		  while (itr.hasNext()) {
			WebElement linksvalues = (WebElement) itr.next();
			if (linksvalues.isEnabled()) {
				enabledLinks++;
				System.out.println("No of working links are:"+enabledLinks);
				System.out.println(linksvalues.getAttribute("title"));
				System.out.println(linksvalues.getText());
			}else{
				disabledLinks++;
				System.out.println("No of not working links are:"+disabledLinks);
			}
		}
	}
}


