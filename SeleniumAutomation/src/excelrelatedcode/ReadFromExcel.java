package excelrelatedcode;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws Exception {
		File src=new File("D:\\workspaceFinal\\SeleniumAutomation\\SampleTest_ReadData.xls");
		FileInputStream fis=new FileInputStream(src);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is :"+data0);
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		wb.close();

	}

}
