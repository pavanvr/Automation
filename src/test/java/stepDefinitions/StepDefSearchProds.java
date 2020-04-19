package stepDefinitions;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.SearchProducts;
import resources.Base;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


@Test
public class StepDefSearchProds extends Base {
	
	@Given("^User enters (.+) and hits Enter key$")
	public void user_enters_and_hits_enter_key(String searchItem) throws Throwable {

		System.out.println(searchItem);
		driver = initDriver();
		
		SearchProducts s = new SearchProducts(driver);
		s.getSearch().sendKeys(searchItem);
		s.getSearch().sendKeys(Keys.ENTER);
	}

	@Then("^search results are displayed$")
	public void search_results_are_displayed() throws Throwable {
		
		String resMessage = SearchProducts.resultsConfirmationMsg();
		System.out.println(resMessage);
		
		if (resMessage.contains("results"))
		{		
			assertThat(resMessage,containsString("results have been found"));
		}
		else
		{		
			assertThat(resMessage,containsString("result has been found"));
		}	
			
	}

}