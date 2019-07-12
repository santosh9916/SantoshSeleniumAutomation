package excelrelatedcode;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel_Adv {

	public static void main(String[] args) throws Exception {
		//File src=new File("D:\\workspaceFinal\\SeleniumAutomation\\SampleTest_ReadData.xls");
		File src=new File("C:\\Users\\Santosh\\Desktop\\ReadFromExcel.xls");
		FileInputStream fis=new FileInputStream(src);
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheet1=wb.getSheetAt(0);
		
		int rowCount=sheet1.getLastRowNum();
		System.out.println(rowCount);
		
		Row row=sheet1.getRow(rowCount);
		
		for (int i = 0; i <= rowCount; i++)
		{
			for (int j = 0; j < row.getLastCellNum() ; j++)
			{
				String data0=sheet1.getRow(i).getCell(j).getStringCellValue();
			    System.out.println(data0);			    
			}	
		}
		wb.close();

	}

}
