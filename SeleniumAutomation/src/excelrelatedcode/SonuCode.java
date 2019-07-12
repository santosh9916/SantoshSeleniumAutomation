package excelrelatedcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SonuCode {

	public static void main(String[] args) throws Exception   {
			FileInputStream fis=new FileInputStream("C:\\Users\\Santosh\\Desktop\\ReadFromExcel.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
     		Sheet sheet1=wb.getSheet("Sheet1");
								
     		for (int i = 0; i <= sheet1.getLastRowNum(); i++) {
    			System.out.println("row count is="+sheet1.getLastRowNum());
    			Row row=sheet1.getRow(i);
    			for (int j = 0; j <row.getLastCellNum(); j++) {
    				System.out.println("cell count is="+row.getLastCellNum());
    				Cell cell=row.getCell(j);
    				if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
    					double d=cell.getNumericCellValue();
    					System.out.println(d);
    				}
    				else if (cell.getCellType()==cell.CELL_TYPE_STRING) {
    					String cellValue=cell.getStringCellValue();
    					System.out.println(cellValue);
    				}
    				else {
    					boolean b=cell.getBooleanCellValue();
    					System.out.println(b);
    				}
    			}
    		}

	}

}
