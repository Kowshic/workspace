/**
 * 
 */
package seleniumPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Kowshic
 *
 */
public class FacebookPropertiesExample {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		//Creation of files
		FileReader fre = new FileReader("Facebook.properties");
		
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
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("Username"));  
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("Password"));  
	}
}
