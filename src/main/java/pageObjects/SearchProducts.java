package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchProducts {

	public static WebDriver driver;
	
	public static final By SEARCH = By.xpath("//input[@id='search_query_top']");
	public static final By PROD_NAME = By.linkText("Printed Summer Dress");
	public static final By RES_TEXT = By.xpath("//*[@id=\'center_column\']/h1/span[2]");
		
	public SearchProducts(WebDriver driver) {
		SearchProducts.driver=driver;
	}
		
	public WebElement getSearch()
	{ 
		return driver.findElement(SEARCH);
	}
	public WebElement getResultsText()
	{ 
		return driver.findElement(RES_TEXT);
	}
		public WebElement getProducts()
	{ 
		return driver.findElement(PROD_NAME);
	}
	public static String resultsConfirmationMsg() {
		String resConfirmationMessage = driver.findElement(RES_TEXT).getText();
		return resConfirmationMessage;
	}
	
}
