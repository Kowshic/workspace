package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://irctc.co.in/");
		driver.findElement(By.xpath(".//*[@id='demon_content']/div[2]/input")).click();
		
		String parentwindow = driver.getWindowHandle();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='loginFormId']/div[1]/div[2]/div[1]")));
		
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(2000);
		
		for(String window: driver.getWindowHandles())
		{
			driver.switchTo().window(window);
		}

		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwindow);
		
		System.out.println(driver.getCurrentUrl());
//		driver.close();
	}
}
