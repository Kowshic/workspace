package internetExplorer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FacebookLogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\Krish\\workspace\\Selenium\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.findElement(By.id("lst-ib")).sendKeys("facebook");
		driver.findElement(By.id("_fZl")).click();
		driver.findElement(By.linkText("Log into Facebook | Facebook")).click();
		driver.findElement(By.id("email")).sendKeys("smartkowshic@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("harini11");	
		driver.findElement(By.id("loginbutton")).click();
	}
}
