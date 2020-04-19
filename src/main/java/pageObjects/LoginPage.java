package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebDriver driver;
	
	public static final By SIGN_IN = By.xpath("//a[@class='login']");
	public static final By EMAIL_ADDRESS = By.xpath("//input[@id='email']");
	public static final By PASSWORD = By.xpath("//input[@id='passwd']");
	public static final By LOGIN = By.xpath("//p[@class='submit']//span[1]");
	public static final By SEARCH = By.xpath("//input[@id='search_query_top']");
	public static final By PROD_NAME = By.xpath("//*[@id=\"homefeatured\"]//img");
	public static final By ADD_TO_CART = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span");
	public static final By CHECK_OUT = By.xpath("//*[contains(text(),'Proceed to checkout')]");
	public static final By CHECK_OUT1 = By.xpath("//span[text()='Proceed to checkout']");
   
       
	public LoginPage(WebDriver driver) {
		LoginPage.driver=driver;
	}
	
	public WebElement getLogin()
	{ 
		return driver.findElement(SIGN_IN);
	}
	public WebElement getEmail()
	{ 
		return driver.findElement(EMAIL_ADDRESS);
	}
	public WebElement getPassword()
	{ 
		return driver.findElement(PASSWORD);
	}
	public WebElement getSignin()
	{ 
		return driver.findElement(LOGIN);
	}
	public WebElement getSearch()
	{ 
		return driver.findElement(SEARCH);
	}
	
	public WebElement getProd()
	{ 
		return driver.findElement(PROD_NAME);
	}
	public WebElement addProdToCart()
	{ 
		return driver.findElement(ADD_TO_CART);
	}
	public WebElement proceedToCheckOut()
	{ 
		return driver.findElement(CHECK_OUT);
	}
	public WebElement proceedToCheckOut1()
	{ 
		return driver.findElement(CHECK_OUT1);
	}
	
}
