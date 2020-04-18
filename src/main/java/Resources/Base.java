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
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + prop.getProperty(key));
		//System.out.println(System.getProperty("user.dir") + Configurations.ChromeDriverPath);
		String userDir = System.getProperty("user.dir");
		System.out.println(userDir);
		FileInputStream fis = new FileInputStream(userDir + "\\src\\main\\java\\Resources\\data.properties");
		
		prop.load(fis);
		String browser = prop.getProperty("browser");
		String browserDriver = prop.getProperty("chromeDriverPath");
		System.out.println(userDir+browserDriver);
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", userDir + prop.getProperty("chromeDriverPath"));
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan\\Selenium\\Drivers\\chromedriver.exe" );
			
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
