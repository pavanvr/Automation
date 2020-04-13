package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Pavan\\MyShopping\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Users//Pavan//Selenium//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			// execute in chrome driver

		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			// firefox code
		} else if (browser.equals("IE")) {
			// IE code
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
}
