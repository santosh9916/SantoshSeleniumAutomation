package io_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelCode {
  @Test(enabled=false)
  public void readNormal() throws IOException {
	  FileInputStream fis = new FileInputStream("D:\\Sample.xls");
	  HSSFWorkbook wb=new HSSFWorkbook(fis);
	  HSSFSheet sheet = wb.getSheet("Sheet1");
	  
	  String row1col1 = sheet.getRow(1).getCell(0).getStringCellValue();
	  System.out.println(row1col1);
	  String r1c1=sheet.getRow(1).getCell(1).getStringCellValue();
	  System.out.println(r1c1);
	  
  }
  @Test
  public void createFile() throws IOException {
	  File file=new File("D:\\Sample.xls");
	  FileInputStream fis = new FileInputStream(file);
	  HSSFWorkbook wb=new HSSFWorkbook(fis);
	  HSSFSheet sheet = wb.getSheet("Sheet1");
	  
	  FileOutputStream fos= new FileOutputStream(file);
	  
	  HSSFCell Username = sheet.getRow(0).getCell(0);
	  
  
	  
  }
}
