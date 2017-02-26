package linkedIN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LinkedInWrapper {
	
	WebDriver driver;
	
	
	/**
	 * launchURL is used for passing the url
	 * @param url
	 */
	public void launchFirefoxURL(String url)
	{
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	public void launchChromeURL(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Krish\\workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.navigate().to(url);
		cdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		cdriver.manage().window().maximize();
	}
	
	public void launchInternetExplorerURL(String url)
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\Krish\\workspace\\Selenium\\driver\\IEDriverServer.exe");
		WebDriver iedriver = new InternetExplorerDriver();
		iedriver.navigate().to(url);
		iedriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		iedriver.manage().window().maximize();
	}
	
	/**
	 * enterValueById is used for setting the name
	 * @param id
	 * @param value
	 */
	public void enterValueById(String id, String value)
	{
		driver.findElement(By.name(id)).sendKeys(value);
	}
	
	
}
