package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
	
	public WebDriver driver;
	
	By signIn = By.xpath("//a[@class='login']");
	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='passwd']");
	By login = By.xpath("//p[@class='submit']//span[1]");
	By search = By.xpath("//input[@id='search_query_top']");
	//By prodName = By.linkText("Printed Summer Dress");
	//By prodAdd = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]");
	//By prodAdd = By.xpath("//button[@name='Submit']");
	//By goBack = By.xpath("//a[@name='back']");
	
	By prodName = By.xpath("//*[@id=\"homefeatured\"]//img");
	
    By addToCart = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span");

    By checkOut = By.xpath("//*[contains(text(),'Proceed to checkout')]");
    By checkOut1 = By.xpath("//span[text()='Proceed to checkout']");
   
       
	public LoginPage(WebDriver driver) {
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
