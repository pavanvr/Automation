package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserAccountPage {

	public static WebDriver driver;

	public static final By USER_AC_HOME = By.xpath("//*[@id='center_column']/p");
	public static final By USER_PERS_INFO = By.xpath("//span[text()='My personal information']");
	public static final By USER_PERS_INFO_CONF_MSG = By.xpath("//*[@id='center_column']/div/h1");

	public UserAccountPage(WebDriver driver) {
		UserAccountPage.driver = driver;
	}

	public WebElement getUserAcPageConfn() {
		return driver.findElement(USER_AC_HOME);
	}

	public WebElement getUserPersInfoPage() {
		return driver.findElement(USER_PERS_INFO);
	}

	public WebElement getUserPersInfoConfMsg() {
		return driver.findElement(USER_PERS_INFO_CONF_MSG);
	}

	
	public static String userPersInfoConfMessage() {

		String confirmationMessage = driver.findElement(USER_PERS_INFO_CONF_MSG).getText();
		return confirmationMessage;

	}
}
