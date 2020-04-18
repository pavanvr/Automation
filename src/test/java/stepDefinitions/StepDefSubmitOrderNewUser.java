package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pageObjects.AddToCart;
import pageObjects.CheckOut;
import resources.Base;

@Test
public class StepDefSubmitOrderNewUser extends Base {

	@Given("^User adds products to the cart and proceeds to checkout$")
	public void user_adds_products_to_the_cart_and_proceeds_to_checkout() throws Throwable {

		driver = initDriver();
		
		AddToCart atc = new AddToCart(driver);

		WebElement prod1 = atc.getProd1();
		Actions action = new Actions(driver);
		action.moveToElement(prod1).build().perform();
		atc.addProdToCart1().click();
		Thread.sleep(2000);
		atc.contToShop().click();
		Thread.sleep(2000);
		WebElement prod2 = atc.getProd2();
		Actions action1 = new Actions(driver);
		action1.moveToElement(prod2).build().perform();
		atc.addProdToCart2().click();
		Thread.sleep(2000);
		atc.proceedToCheckOut().click();
		atc.proceedToCheckOut1().click();

		
		CheckOut co = new CheckOut(driver);
		co.createNewAccount();
		co.proceedToChkout();

	}

	@Then("^Order is successful and a confirmation is displayed$")
	public void order_is_successful_and_a_confirmation_is_displayed() throws Throwable {

		String Message = CheckOut.orderConfirmationMsg();
		Assert.assertTrue(Message.equalsIgnoreCase("Your order on My Store is complete."));
		System.out.println(Message);
	}

}