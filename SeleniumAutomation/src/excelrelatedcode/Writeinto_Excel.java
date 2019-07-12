package excelrelatedcode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeinto_Excel {

	public static void main(String[] args) throws IOException   {
		File file=new File("E://ExcelExample.xlsx");
		FileInputStream fi = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet mySheet = wb.getSheet("Sheet1");
		 mySheet.getRow(1).createCell(1).setCellValue("Hi Santosh");
		
		FileOutputStream fos= new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		

	}

}
