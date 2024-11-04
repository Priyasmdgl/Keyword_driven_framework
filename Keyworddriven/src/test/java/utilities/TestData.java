package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	FileInputStream excel;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	
public void Excel() throws IOException {
	 excel = new FileInputStream("src\\test\\resources\\TestData.xlsx");
	 workbook = new XSSFWorkbook(excel);
	 sheet = workbook.getSheet("Sheet1");
	
}
public String value(int row, int column) {
    cell = sheet.getRow(row).getCell(column);
	String value = cell.getStringCellValue();
	//System.out.println(value);
	return value;
}
}
