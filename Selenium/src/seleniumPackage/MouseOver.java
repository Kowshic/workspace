package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		
		driver.navigate().to("http://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement mouseover = driver.findElement(By.linkText("Making payments"));
		
		WebElement mouseclick =  driver.findElement(By.xpath("//a[contains(text(),'Pay via SmartHub')]"));		
		Actions act = new Actions(driver);
		act.moveToElement(mouseover).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		act.click(mouseclick).perform();
//		act.doubleClick(mouseclick).perform();
		
		System.out.println("hi");
	}
}
