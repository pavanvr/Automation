package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	
	public static WebDriver driver;
	
	public static final By prodName1 = By.xpath("//*[@id=\'homefeatured\']//img");
	
	public static final By selProd1 = By.xpath("//*[@id=\'homefeatured\']/li[1]/div/div[2]/div[2]/a[1]/span");
     
	public static final By continueShop = By.xpath("//span[@title='Continue shopping']");
    
	public static final By prodName2 = By.xpath("//*[@id=\'homefeatured\']/li[3]/div/div[1]/div/a[1]/img");
    
	public static final By selProd2 = By.xpath("//*[@id=\'homefeatured\']/li[3]/div/div[2]/div[2]/a[1]/span");

	public static final By checkOut = By.xpath("//*[contains(text(),'Proceed to checkout')]");
    
	public static final By checkOut1 = By.xpath("//span[text()='Proceed to checkout']");
    
	//public static final By checkOut1 = By.xpath("//*[contains(text(),'Proceed to checkout']");
   
       
	public AddToCart(WebDriver driver) {
		AddToCart.driver=driver;
	}
	

	public WebElement getProd1()
	{ 
		return driver.findElement(prodName1);
	}
	public WebElement getProd2()
	{ 
		return driver.findElement(prodName2);
	}
	public WebElement addProdToCart1()
	{ 
		return driver.findElement(selProd1);
	}
	public WebElement addProdToCart2()
	{ 
		return driver.findElement(selProd2);
	}
	public WebElement contToShop()
	{ 
		return driver.findElement(continueShop);
	}
	public WebElement proceedToCheckOut()
	{ 
		return driver.findElement(checkOut);
	}
	public WebElement proceedToCheckOut1()
	{ 
		return driver.findElement(checkOut1);
	}
	
}
