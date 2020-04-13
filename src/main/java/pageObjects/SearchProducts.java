package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchProducts {

	public WebDriver driver;
	
	By search = By.xpath("//input[@id='search_query_top']");
	By prodName = By.linkText("Printed Summer Dress");
	By resText = By.xpath("//*[@id=\"center_column\"]/h1/span[2]");
	
	public SearchProducts(WebDriver driver) {
		this.driver=driver;
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
	
}
