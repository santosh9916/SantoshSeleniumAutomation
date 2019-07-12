package excelrelatedcode;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	
	public static void readFromExcel() throws Exception{
		FileInputStream fi=new FileInputStream("D:\\workspaceFinal\\SeleniumAutomation\\TestData\\GmailLogin.xls");
		Workbook wb=WorkbookFactory.create(fi);
		org.apache.poi.ss.usermodel.Sheet s=wb.getSheet("Sheet1");
		System.out.println(s.getLastRowNum());
		FileOutputStream fo=new FileOutputStream("D:\\workspaceFinal\\SeleniumAutomation\\TestData\\GmailLogin.xls");
		wb.write(fo);
		wb.close();
		for (int i = 0; i < s.getLastRowNum(); i++) {
			Row r=s.getRow(i);
			for (int j = 0; j < r.getLastCellNum(); j++) {
				Cell c= r.getCell(j);
				if (c.getCellType()==c.CELL_TYPE_STRING) {
					System.out.println(c.getStringCellValue());
				}
				if (c.getCellType()==c.CELL_TYPE_NUMERIC) {
					System.out.println(c.getNumericCellValue());
					
						
					}
				}
			}
		}
	

	public static void main(String[] args) throws Exception {
		readFromExcel();
		

	}

}
