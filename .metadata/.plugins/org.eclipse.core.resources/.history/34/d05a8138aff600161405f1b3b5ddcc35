package seleniumPackage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FrameworkProgamed {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MyFrameworkWrapFile wm = new MyFrameworkWrapFile();
		FileReader file = new FileReader("Framework.properties");
		
		Properties prop = new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		wm.launchBrowser(prop.getProperty("browser"));
		wm.invokeAppChrome(prop.getProperty("url"));
	}

}
