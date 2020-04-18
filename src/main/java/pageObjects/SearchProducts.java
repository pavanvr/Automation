package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchProducts {

	public static WebDriver driver;
	
	public static final By search = By.xpath("//input[@id='search_query_top']");
	public static final By prodName = By.linkText("Printed Summer Dress");
	public static final By resText = By.xpath("//*[@id=\"center_column\"]/h1/span[2]");
	
	public SearchProducts(WebDriver driver) {
		SearchProducts.driver=driver;
	}
	
	
	public WebElement getSearch()
	{ 
		return driver.findElement(search);
	}
	public WebElement getResultsText()
	{ 
		return driver.findElement(resText);
	}
	public WebElement getProducts()
	{ 
		return driver.findElement(prodName);
	}
	public static String resultsConfirmationMsg() {
		String resConfirmationMessage = driver.findElement(resText).getText();
		return resConfirmationMessage;
	}
}
