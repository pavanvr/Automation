package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	
	public static WebDriver driver;
	
	public static final By PROD_NAME1 = By.xpath("//*[@id=\'homefeatured\']//img");
	
	public static final By SEL_PROD1 = By.xpath("//*[@id=\'homefeatured\']/li[1]/div/div[2]/div[2]/a[1]/span");
     
	public static final By CONTINUE_SHOP = By.xpath("//span[@title='Continue shopping']");
    
	public static final By PROD_NAME2 = By.xpath("//*[@id=\'homefeatured\']/li[3]/div/div[1]/div/a[1]/img");
    
	public static final By SEL_PROD2 = By.xpath("//*[@id=\'homefeatured\']/li[3]/div/div[2]/div[2]/a[1]/span");

	public static final By CHECK_OUT = By.xpath("//*[contains(text(),'Proceed to checkout')]");
    
	public static final By CHECK_OUT1 = By.xpath("//span[text()='Proceed to checkout']");
    
	   
       
	public AddToCart(WebDriver driver) {
		AddToCart.driver=driver;
	}
	

	public WebElement getProd1()
	{ 
		return driver.findElement(PROD_NAME1);
	}
	public WebElement getProd2()
	{ 
		return driver.findElement(PROD_NAME2);
	}
	public WebElement addProdToCart1()
	{ 
		return driver.findElement(SEL_PROD1);
	}
	public WebElement addProdToCart2()
	{ 
		return driver.findElement(SEL_PROD2);
	}
	public WebElement contToShop()
	{ 
		return driver.findElement(CONTINUE_SHOP);
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
