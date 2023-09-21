package poiApi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FindSheetCount {
      public static void main(String[] args) throws IOException {
    	  
		FileInputStream file=new FileInputStream("C:\\Users\\dell\\Downloads\\ExcelTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		int sheetCount=workbook.getNumberOfSheets();
		System.out.println(sheetCount);
	}
}
