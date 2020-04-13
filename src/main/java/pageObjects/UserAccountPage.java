package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserAccountPage {
	
	public WebDriver driver;
	
	
	By userAcHome = By.xpath("//*[@id=\"center_column\"]/h1");
	
	
	
	public UserAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getUserAc()
	{ 
		return driver.findElement(userAcHome);
	}
	
}
