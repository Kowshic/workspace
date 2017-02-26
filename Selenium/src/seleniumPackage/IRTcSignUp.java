package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IRTcSignUp {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("awrsfnk");
		driver.findElement(By.id("userRegistrationForm:password")).sendKeys("owshicZ");
		driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("owshicZ");
		
		driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("owshic");
		
		// DropDown
		
		WebElement element = driver.findElement(By.id("userRegistrationForm:securityQ"));
		Select se = new Select(element);
		se.selectByIndex(1);
	}
}
