package seleniumPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWriteToExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DataOutput");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);

		cell.setCellValue("UserName");

		row.createCell(1).setCellValue("Password");

		XSSFRow row2 = sheet.createRow(1);

		row2.createCell(0).setCellValue("kowshic");

		FileOutputStream file = new FileOutputStream(new File("C:\\Users\\Krish\\workspace\\Selenium\\DataOutput.xlsx"));

		workbook.write(file);
		
		System.out.print("hi");

		file.close();
	}
}