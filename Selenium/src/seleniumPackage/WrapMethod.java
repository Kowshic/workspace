package seleniumPackage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapMethod {
	WebDriver driver;

	/**
	 * launchURL is used for passing the url
	 * @param url
	 */
	public void launchURL(String url)
	{
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	/**
	 * enterValueById is used for setting the name
	 * @param id
	 * @param value
	 */
	public void enterValueById(String id, String value)
	{
		driver.findElement(By.id(id)).sendKeys(value);
	}

	/**
	 * clickByLinkText is for clicking the link
	 * @param link
	 */
	public void clickByLinkText(String link)
	{
		driver.findElement(By.linkText(link)).click();
	}

	/**
	 * enterValueByName is used for setting password
	 * @param id
	 * @param value
	 */
	public void enterValueByName(String id, String value)
	{
		driver.findElement(By.name(id)).sendKeys(value);

	}

	/**
	 * enterValueByXpath is used for passwordConfirmation textBox
	 * @param xpath
	 * @param value
	 */
	public void enterValueByXpath(String xpath,String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}


//	public void dropselectByIndex(String idLoc, int value)
//	{
//		WebElement element = driver.findElement(By.id("idLoc"));
//		Select se = new Select(element);
//		se.selectByIndex(value);
//	}
	
	public void dropselectByValue(String idLoc, String strvalues)
	{
		WebElement element = driver.findElement(By.xpath(idLoc));
		Select se = new Select(element);
		se.selectByVisibleText(strvalues);
//		strvalues = se(selectByValue("What is your favorite past-time?");
	}

	/**
	 * securityAnswer is the checking for security answer TextBox
	 * @param xpath
	 * @param value
	 */
	public void seurityAnswer(String xpath, String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}

	public void closeApp()
	{
		driver.close();
	}

}
