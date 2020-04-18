package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public static WebDriver driver;
	
	public static final By signIn = By.xpath("//a[@class='login']");
	
	
	
	
	public LandingPage(WebDriver driver) {
		LandingPage.driver=driver;
	}
	
	public WebElement getLogin()
	{ 
		return driver.findElement(signIn);
	}
	
	
	
}
