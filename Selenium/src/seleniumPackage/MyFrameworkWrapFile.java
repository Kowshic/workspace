package seleniumPackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyFrameworkWrapFile {


	FirefoxDriver driver = new FirefoxDriver();

	ChromeDriver cdriver;
	String chromepath="C:\\Users\\Krish\\workspace\\Selenium\\driver\\chromedriver.exe";

	InternetExplorerDriver iedriver;
	String iepath="C:\\Users\\Krish\\workspace\\Selenium\\driver\\IEDriverServer.exe";

	public void launchBrowser(String brName) throws MalformedURLException{

		if(brName.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
		} else if(brName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",chromepath);
			cdriver = new ChromeDriver();
		} else if(brName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver",iepath);
			iedriver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	/*
	 * To launch the firefox browser & implicitly wait & maximize
	 */
	public void invokeApp(String URL) throws IOException {
			driver.get(URL);
	}

	/*
	 * To launch the chrome browser & implicitly wait & maximize
	 */
	public void invokeAppChrome(String URL) throws IOException {
		cdriver.get(URL);
	}

	/*
	 * To launch the IE browser & implicitly wait & maximize
	 */
	public void invokeAppIe(String URL) throws IOException {
		iedriver.get(URL);
	}



}
