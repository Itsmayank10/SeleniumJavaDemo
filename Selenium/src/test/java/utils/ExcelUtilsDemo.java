package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {

		ExcelUtils excel = new ExcelUtils("C:\\Users\\HP\\eclipse-workspace\\Selenium\\excel\\data.xlsx", "Sheet1");

		excel.getRowCount();
		excel.getColCount();
		excel.getCellDataString(1, 0);
		excel.getCellDataNumber(1, 1);
	}

}