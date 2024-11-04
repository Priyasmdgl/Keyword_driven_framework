package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class entry {

	FileInputStream file;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public void file() throws Exception {
		 file = new FileInputStream("src\\test\\resources\\entry.xlsx");
		 workbook = new XSSFWorkbook(file);
		 sheet = workbook.getSheet("Sheet1");
	}
	public String cell(int row,int column) {
		XSSFCell cell = sheet.getRow(row).getCell(column);
		String value = cell.getStringCellValue();
		return value;
	}
}
