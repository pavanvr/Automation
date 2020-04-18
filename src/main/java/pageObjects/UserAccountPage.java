package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserAccountPage {
	
	public static WebDriver driver;
	
	
	public static final By userAcHome = By.xpath("//*[@id='center_column']/p");
	public static final By userPersInfo = By.xpath("//span[text()='My personal information']");
	public static final By userPersInfoConfMsg = By.xpath("//*[@id='center_column']/div/h1");
	
	public UserAccountPage(WebDriver driver) {
		UserAccountPage.driver=driver;
	}

	public WebElement getUserAcPageConfn()
	{
		return driver.findElement(userAcHome);
	}
	
	public WebElement getUserPersInfoPage()
	{
		return driver.findElement(userPersInfo);
	}
	
	public WebElement getUserPersInfoConfMsg()
	{
		return driver.findElement(userPersInfoConfMsg);
	}
	/*
	public static String userMyAcConfMessage() {
		String ConfirmationMessage = driver.findElement(userAcHome).getText();
		return ConfirmationMessage;
	}
	*/
	public static String userPersInfoConfMessage() {
		
		String confirmationMessage = driver.findElement(userPersInfoConfMsg).getText();
		return confirmationMessage;
		
	}
}
