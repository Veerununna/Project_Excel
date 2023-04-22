package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectPath;
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		getCellData();
	}
	public static void getRowCount() {
		try {
			projectPath = System.getProperty("user.dir");
			workBook = new XSSFWorkbook(projectPath + "/Excel/data.xlsx");
			sheet = workBook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No.of rows present : " + rowCount);
		}
		catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
	}

	public static void getCellData() {
		try {
			projectPath = System.getProperty("user.dir");
			workBook = new XSSFWorkbook(projectPath + "/Excel/data.xlsx");
			sheet = workBook.getSheet("Sheet1");
			String value = sheet.getRow(1).getCell(1).getStringCellValue();
			System.out.println(value);
		}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
	}
}
