package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Base;

public class SearchResPage extends Base {

public static WebDriver driver;
	
	public SearchResPage(WebDriver driver) {
    	
    	SearchResPage.driver = driver;
    }
        public static final By resText = By.xpath("//*[@id=\"center_column\"]/h1/span[2]");
        //By PROCEED_TO_CHECKOUT_IDENTIFIER = By.xpath("//span[text()='Proceed to checkout']");
    
    
    
    public SearchProducts getSearchRes() throws InterruptedException {
        
    	driver.findElement(resText);
        Thread.sleep(1000);
        return new SearchProducts(driver);

    }

}
