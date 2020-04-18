package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebDriver driver;
	
	public static final By signIn = By.xpath("//a[@class='login']");
	public static final By email = By.xpath("//input[@id='email']");
	public static final By password = By.xpath("//input[@id='passwd']");
	public static final By login = By.xpath("//p[@class='submit']//span[1]");
	public static final By search = By.xpath("//input[@id='search_query_top']");
	public static final By prodName = By.xpath("//*[@id=\"homefeatured\"]//img");
	public static final By addToCart = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span");
	public static final By checkOut = By.xpath("//*[contains(text(),'Proceed to checkout')]");
	public static final By checkOut1 = By.xpath("//span[text()='Proceed to checkout']");
   
       
	public LoginPage(WebDriver driver) {
		LoginPage.driver=driver;
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
	public WebElement getSearch()
	{ 
		return driver.findElement(search);
	}
	
	public WebElement getProd()
	{ 
		return driver.findElement(prodName);
	}
	public WebElement addProdToCart()
	{ 
		return driver.findElement(addToCart);
	}
	public WebElement proceedToCheckOut()
	{ 
		return driver.findElement(checkOut);
	}
	public WebElement proceedToCheckOut1()
	{ 
		return driver.findElement(checkOut1);
	}
	/*public WebElement getProdAdd()
	{ 
		return driver.findElement(prodAdd);
	}
	public WebElement getBack()
	{ 
		return driver.findElement(goBack);
	}*/
}
