package lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	Sheet sh;

	public ExcelRead(String filename, String sheetname) throws IOException {

		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(sheetname);
	}
 
	public Object[][] excelToArray() {

		Object[][] array;
		int totalRows = sh.getPhysicalNumberOfRows();
		int totalCols = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println(totalRows);
		System.out.println(totalCols);
		array = new Object[totalRows - 1][totalCols];
		
		for (int row =1; row<totalRows;row++) {
			
			for (int col=0;col<totalCols;col++) {

				Cell c = sh.getRow(row).getCell(col);
				if (c.getCellType() == Cell.CELL_TYPE_STRING) {
					String t = c.getStringCellValue();
					System.out.println(row); 
					System.out.println(col);
					array[row-1][col] = t;
				} else {
					if (c.getNumericCellValue() % 1 == 0) {
						int v = (int) c.getNumericCellValue();
						array[row-1][col] = "" + v;
					} else {
						double d = c.getNumericCellValue();
						array[row-1][col] = "" + d;
					}
				}
				
			}
			
		}
		return array;
	}

}