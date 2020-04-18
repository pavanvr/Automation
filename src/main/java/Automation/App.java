package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObjects.LoginPage;
import resources.Base;

/**
 * Hello world!
 *
 */
/*public class App extends Base
{
	public void user_is_in_landing_page() throws Throwable {
    	driver=initDriver();
    	driver.get(prop.getProperty("url"));
    	LoginPage l = new LoginPage(driver);
    	//l.getLogin().click();
    }
	 public void user_clicks_and_adds_product_to_cart() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		    	WebElement TShirt = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]//img"));
		    		    Actions a = new Actions(driver);
		    		    a.moveToElement(TShirt).build().perform();
		    		    WebElement ADD_TO_CART_BUTTON_IDENTIFIER = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span"));
		    		    ADD_TO_CART_BUTTON_IDENTIFIER.click();
		    	Thread.sleep(1000);
		    WebElement PROCEED_TO_CHECKOUT_IDENTIFIER = driver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]"));
		    PROCEED_TO_CHECKOUT_IDENTIFIER.click();
		    WebElement PROCEED_TO_CHECKOUT_2_IDENTIFIER = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		    PROCEED_TO_CHECKOUT_2_IDENTIFIER.click();

}
}*/
