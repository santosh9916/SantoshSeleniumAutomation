package excelrelatedcode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WriteinExcel {
     WebDriver driver;
     
     public void openBrowser(){
    	 driver=new FirefoxDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().deleteAllCookies();
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.get("http://www.gmail.com");
     }
     public void excelCode() throws Exception{
    	 File src=new File("D:\\workspaceFinal\\SeleniumAutomation\\SampleTest_ReadData.xls");
    	 FileInputStream fis=new FileInputStream(src);
    	 Workbook wb=WorkbookFactory.create(fis);
    	 Sheet sheet=wb.getSheetAt(0);
    	 int lastrow = sheet.getLastRowNum();
    	 System.out.println("Total Row"+lastrow);
    	 Row rows=sheet.getRow(lastrow);
    	 System.out.println(rows);
    	 
    	 FileOutputStream fos=new FileOutputStream(src);
    	 wb.write(fos);
    	 
    	 for (int i = 1; i <= lastrow; i++)
    	 {
    		 for (int j = 0; j < rows.getLastCellNum(); j++) {
    			 
				
			}
			
		}
    	 
     }
    
     
	public static void main(String[] args) throws Exception {
		WriteinExcel w=new WriteinExcel();
		w.openBrowser();
		w.excelCode();
		

	}

}
