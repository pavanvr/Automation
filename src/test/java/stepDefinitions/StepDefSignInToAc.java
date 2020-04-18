package stepDefinitions;

import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.CreateAccountPage;
import pageObjects.LoginPage;
import pageObjects.UserAccountPage;
import resources.Base;

@Test
public class StepDefSignInToAc extends Base {

	@Given("^user is in landing page$")
	public void user_is_in_landing_page() throws Throwable {

		driver = initDriver();
	}

	@When("^user logs in to application with (.+) and (.+)$")
	public void user_logs_in_to_application_with_and(String email, String password) throws Throwable {
		
		LoginPage lp = new LoginPage(driver);
		lp.getLogin().click();
		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(password);
		lp.getSignin().click();

	}

	@Then("^User home page is displayed and user proceeds to check personal information$")
	public void user_home_page_is_displayed_and_user_proceeds_to_check_personal_infoormation() throws Throwable {

		UserAccountPage ua = new UserAccountPage(driver);
		String myAcConfMessage = ua.getUserAcPageConfn().getText();
		System.out.println(myAcConfMessage);
		Assert.assertTrue(myAcConfMessage.equalsIgnoreCase(
				"Welcome to your account. Here you can manage all of your personal information and orders."));

		ua.getUserPersInfoPage().click();
		// String userPersInfo = ua.getUserPersInfoConfMsg().getText();
		// System.out.println(userPersInfo);
	}

	@Then("^User personal information page is displayed with user personal details$")
	public void user_personal_information_page_is_displayed_with_user_personal_details() throws Throwable {
		// System.out.println("AcDet");
		// UserAccountPage ua = new UserAccountPage(driver);
		// ua.getUserPersInfoPage().click();

		String userPersInfoConfMessage = UserAccountPage.userPersInfoConfMessage();
		System.out.println(userPersInfoConfMessage);
		Assert.assertTrue(userPersInfoConfMessage.equalsIgnoreCase("Your personal information"));
	}

}