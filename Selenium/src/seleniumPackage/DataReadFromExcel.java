package seleniumPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.FileUtils;

public class DataReadFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Krish\\workspace\\Selenium\\data\\DataInput.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		driver.get("https://www.linkedin.com/uas/login");	
		
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
			XSSFCell cell2 = row.getCell(1);
			driver.get("https://www.linkedin.com/uas/login");
			driver.findElement(By.name("session_key")).sendKeys(
					cell.getStringCellValue());
			driver.findElement(By.name("session_password")).sendKeys(
					cell2.getStringCellValue());
			int j = 1;
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			org.apache.commons.io.FileUtils.copyFile(src, new File("D:\\screenshot"+j+"j"+".png"));
			
			j++;
			driver.findElement(By.name("signin")).click();
			
//			driver.findElement(By.linkText("Sign Out")).click();
			
		}
		driver.close();
	}
}
