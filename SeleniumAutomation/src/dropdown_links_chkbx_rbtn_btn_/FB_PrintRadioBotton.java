package dropdown_links_chkbx_rbtn_btn_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_PrintRadioBotton {
	public static void main(String[] args) {
		int enabledLinks=0;
		int disabledLinks=0;
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.facebook.com");
		
		List<WebElement> listRadioBotton=driver.findElements(By.tagName("input"));
		System.out.println("Total no of radio botton:"+listRadioBotton.size());
		for (int i = 0; i < listRadioBotton.size(); i++) {
			if (listRadioBotton.get(i).getAttribute("type").equalsIgnoreCase("radio"))
			{                   //only print the radio botton
				enabledLinks++;
				System.out.println("Enable Radio Botton  Name is      :        "+listRadioBotton.get(i).getAttribute("id"));
			}else{
				disabledLinks++;
				System.out.println("Disabled Radio Botton  is:"+listRadioBotton.get(i).getAttribute("id"));
			}
			
		}
		         //Here i can't take any common property name
		/*List<WebElement> listRadioBotton=driver.findElements(By.cssSelector("//input[type='radio']"));
		System.out.println("Total no of radio botton:"+listRadioBotton.size());
		Iterator iterator=listRadioBotton.iterator();
		while (iterator.hasNext()) {
			WebElement listValues = (WebElement) iterator.next();
			if (listValues.isEnabled()) {
				enabledLinks++;
				System.out.println("Enabled Radio Bottons are:"+enabledLinks);
				String str=listValues.getText();
				ArrayList arrayList=new ArrayList();
				arrayList.add(str);
				System.out.println("Enabled RBotton is:       "+arrayList);
			}else{
				disabledLinks++;
				System.out.println("Disabled Radio Bottons are:"+disabledLinks);
				String str=listValues.getText();
				ArrayList arrayList1=new ArrayList();
				arrayList1.add(str);
				System.out.println("Disabled RBotton is:       "+arrayList1);
				
			}
			
		}*/
	}

}
