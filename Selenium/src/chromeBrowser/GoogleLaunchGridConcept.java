package chromeBrowser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleLaunchGridConcept {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Krish\\workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		*/
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WIN8_1);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.85:5555/wd/hub"), dc); // IP here  is HUB Ip
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		String title = driver.getTitle();
		System.out.println(title);
	}
}
