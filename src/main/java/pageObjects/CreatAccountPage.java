package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatAccountPage {
	
	public WebDriver driver;
	
	By signIn = By.xpath("//a[@class='login']");
	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='passwd']");
	By login = By.xpath("//p[@class='submit']//span[1]");
	
	public CreatAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getLogin()
	{ 
		return driver.findElement(signIn);
	}
	public WebElement getEmail()
	{ 
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{ 
		return driver.findElement(password);
	}
	public WebElement getSignin()
	{ 
		return driver.findElement(login);
	}
}
