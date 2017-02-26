package seleniumPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Erail {

	public static void main(String[] args) throws FileNotFoundException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		//Creation of files
		FileReader fre = new FileReader("Erail.properties");
		
		//Creation of properties
		Properties prop = new Properties();
		
		//Loading of Property Files
		try {
			prop.load(fre);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.className("optionsTopic")).click();
		
		driver.findElement(By.id(prop.getProperty("origin"))).clear();
//		driver.findElement(By.id(prop.getProperty("origin"))).sendKeys(Keys.TAB);
		driver.findElement(By.xpath(".//*[@id='origin']")).sendKeys(prop.getProperty("origin")); 
//	
//		driver.findElement(By.id(prop.getProperty("destination"))).clear();
//		driver.findElement(By.id(prop.getProperty("destination"))).sendKeys(Keys.TAB);
		driver.findElement(By.xpath(".//*[@id='destination']")).sendKeys(prop.getProperty("destination"));
		
//		driver.findElement(By.id("email")).sendKeys(prop.getProperty("Username"));  
//		 //Read Password from Properties and send to facebook password text field   
//		 driver.findElement(By.id("pass")).sendKeys(prop.getProperty("Password"));  
	}
}
