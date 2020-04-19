package stepDefinitions;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.CreateAccountPage;
import resources.Base;
import resources.DataHelper;

@Test
public class StepDefCreateAccount extends Base {

	@Given("^user is in signIn page$")
	public void user_is_in_signIn_page() throws Throwable {
        
		//user in sign-in page
    }

	@When("^user enters all the details and completes registration for a new account$")
	public void user_enters_all_the_details_and_completes_registration_for_a_new_account() throws Throwable {
	       
    	driver = initDriver();
		
		CreateAccountPage createAc = new CreateAccountPage(driver);
		String text = DataHelper.alphaNumericString(5);
		String email = text+"@mailmaru.com";
		System.out.println(email);
		createAc.getCreateAcPage(email);
		createAc.createNewAccount();
		
    }
    
	@Then("^User account is created and user home page is displayed$")
	public void user_account_is_created_and_user_home_page_is_displayed() throws Throwable {

		String confMessage = CreateAccountPage.createAcConfMessage();
		System.out.println(confMessage);
		Assert.assertTrue(confMessage.equalsIgnoreCase(
				"Welcome to your account. Here you can manage all of your personal information and orders."));
		
	}

}