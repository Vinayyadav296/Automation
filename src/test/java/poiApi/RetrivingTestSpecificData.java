package poiApi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RetrivingTestSpecificData {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("ExcelTestData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		int sheetCount = workbook.getNumberOfSheets();

		for (int i = 0; i < sheetCount; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("Data")) {

				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();

				Row firstrow = rows.next();

				Iterator<Cell> cells = firstrow.iterator();

				int c = 0;
				int columnposition = 0;

				while (cells.hasNext()) {
					Cell cell = cells.next();

					if (cell.getStringCellValue().equalsIgnoreCase("Tests")) {

						columnposition = c;

					}

					c++;
				}

				while (rows.hasNext()) {

					Row row = rows.next();

					Cell cell = row.getCell(columnposition);

					if (cell.getStringCellValue().equalsIgnoreCase("Register")) {

						Iterator<Cell> citr = row.iterator();

						while (citr.hasNext()) {

							System.out.println(citr.next().getStringCellValue());

						}

					}

				}

				workbook.close();

			}
		}
	}
}
