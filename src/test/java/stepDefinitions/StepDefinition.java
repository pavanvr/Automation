package stepDefinitions;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Resources.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SearchProducts;
import pageObjects.UserAccountPage;

public class StepDefinition extends Base{

	    @Given("^user is in landing page$")
	    public void user_is_in_landing_page() throws Throwable {
	    	driver=initDriver();
	    	driver.get(prop.getProperty("url"));
	    	LoginPage l = new LoginPage(driver);
	    	l.getSearch().isDisplayed();
	    			
	    	/*WebElement prod = l.getProd();
	    	Actions action = new Actions(driver);
			action.moveToElement(prod).build().perform();
	    	l.addProdToCart().click();
	    	
	    	l.proceedToCheckOut().click();
	    	l.proceedToCheckOut1().click();*/
	    	
	    	
	 	    }

	    @When("^user logs in to application with (.+) and (.+)$")
	    public void user_logs_in_to_application_with_and(String email, String password) throws Throwable {
	    	 	LoginPage lp = new LoginPage(driver);
	    		lp.getLogin().click();
	    	 	lp.getEmail().sendKeys(email);
	    		lp.getPassword().sendKeys(password);
	    		lp.getSignin().click();
	    		
	    		//lp.getSearch().sendKeys(searchItem);
		    	//lp.getSearch().sendKeys(Keys.ENTER);
		    	
		    	/*//lp.getProd().click();
		    	//lp.getProdAdd().click();
		    	//lp.getBack().click();
		    	Actions a = new Actions(driver);
		    	 a.moveToElement(lp.getProd()).build().perform();
		    	//a.moveToElement(lp.getProd()).clickAndHold().click(lp.getProdAdd());
		    	lp.addProdToCart().click();
		    	 Thread.sleep(1000);
		    	lp.proceedToCheckOut().click(); 
		    	lp.proceedToCheckOut1().click();*/
	    }

	    @Then("^User home page is displayed$")
	    public void user_home_page_is_displayed() throws Throwable {
	    	 
	    	 UserAccountPage ua=new UserAccountPage(driver);
	    	 String msg = ua.getUserAc().getText();
	    	 System.out.println(msg);
	         Assert.assertTrue(msg.contains("MY ACCOUNT"));
	         driver.close();
	         
	   	}
	    

	    @And("^User account details are diaplyed$")
	    public void user_account_details_are_diaplyed() throws Throwable {
	    	System.out.println("AcDet");
	    }
	    
	    
	    @Given("^I enter (.+) and hit Enter key$")
	    public void i_enter_and_hit_enter_key(String searchItem) throws Throwable {
	       
	    	System.out.println(searchItem);
	    	driver=initDriver();
	    	driver.get(prop.getProperty("url"));
	    	
	    	SearchProducts s = new SearchProducts(driver);
	    	
	    	s.getSearch().sendKeys(searchItem);
	    	s.getSearch().sendKeys(Keys.ENTER);
	    	
	    	    	
	    	
	    	
	 
	    	
	    }

	    @Then("^search results are displayed$")
	    public void search_results_are_displayed() throws Throwable {
	    	
	    	SearchProducts sp = new SearchProducts(driver);
	    	String results = sp.getResultsText().getText();
	    	System.out.println(results);
	    	sp.getProducts().click();
	    		       
	    }
	    
	    @Given("^User adds products to the cart and proceeds to checkout$")
	    public void user_adds_products_to_the_cart_and_proceeds_to_checkout() throws Throwable {
	        
	    	driver=initDriver();
	    	driver.get(prop.getProperty("url"));
	    	LoginPage l = new LoginPage(driver);
	    	
	    	WebElement prod = l.getProd();
	    	Actions action = new Actions(driver);
			action.moveToElement(prod).build().perform();
	    	l.addProdToCart().click();
	    	
	    	l.proceedToCheckOut().click();
	    	l.proceedToCheckOut1().click();
	    }

	    @Then("^Order is successful and a confirmation is displayed$")
	    public void order_is_successful_and_a_confirmation_is_displayed() throws Throwable {
	      
	    }

	}