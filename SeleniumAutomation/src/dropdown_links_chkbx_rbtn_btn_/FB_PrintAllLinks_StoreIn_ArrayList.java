package dropdown_links_chkbx_rbtn_btn_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_PrintAllLinks_StoreIn_ArrayList {
	public static void main(String[] args) {
		int enabledLinks=0;
		int disabledLinks=0;
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  System.out.println("Total no of links are:"+links.size());
		  
		  Iterator iterator=links.iterator();
		  while (iterator.hasNext()) {
			WebElement linksvalues = (WebElement) iterator.next();
			if (linksvalues.isEnabled()) {
				enabledLinks++;
				System.out.println("No of working links are:"+enabledLinks);
				//To know Which Links are Enables
				String link=linksvalues.getText();
				ArrayList arrayList=new ArrayList();
				arrayList.add(link);
				System.out.println("Enabled links are:"+arrayList);
			}else{
				disabledLinks++;
				System.out.println("No of not working links are:"+disabledLinks);
				
				//To know Which Links are Disables
				String link1=linksvalues.getText();
				ArrayList arrayList1=new ArrayList();
				arrayList1.add(link1);
				System.out.println("Disabled links are:"+link1);
				            
			}
		}
	}
}
