package seleniumPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProgramWrap {
	
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		WrapMethod wm = new WrapMethod();
		FileReader file = new FileReader("prop2.properties");
		
		Properties prop = new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wm.launchURL(prop.getProperty("url"));
		wm.enterValueById(prop.getProperty("usernameloc"), prop.getProperty("usernamevalue"));
		wm.clickByLinkText(prop.getProperty("linkloc"));
		wm.enterValueByName(prop.getProperty("pwdloc"), prop.getProperty("pwdvalue"));
		wm.enterValueByXpath(prop.getProperty("confpwdloc"), prop.getProperty("confpwdvalue"));
		
//		wm.choseSecurityQuestion(prop.getProperty("userRegistrationForm:securityQ"));
		wm.dropselectByValue(prop.getProperty("idlocator"),"What is your favorite past-time?");
		
		wm.seurityAnswer(prop.getProperty("securitylocation"), prop.getProperty("securityvalue"));
		
//		wm.closeApp();	
	}
}
