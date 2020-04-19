package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.sun.xml.internal.fastinfoset.sax.Properties;

public class Base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initDriver() throws IOException {
		
		prop = new Properties();
		
		String userDir = System.getProperty("user.dir");
		System.out.println(userDir);
		FileInputStream fis = new FileInputStream(userDir + "\\src\\main\\java\\Resources\\data.properties");
		
		prop.load(fis);
		String browser = prop.getProperty("browser");
				
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", userDir + prop.getProperty("chromeDriverPath"));
					
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", userDir + prop.getProperty("firefoxDriverPath"));
			driver = new FirefoxDriver();
			
		} else if (browser.equals("IE")) {
			// IE code
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
}
