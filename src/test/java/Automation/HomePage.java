package Automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resources.Base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends Base {
	
	public HomePage() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void homePageNavigation() throws IOException 
	{
		driver=initDriver();
		String url = prop.getProperty("url");
		driver.get(url);
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("komomolk123@gmail.com");
		lp.getPassword().sendKeys("john123");
		lp.getSignin().click();
		
	}
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

}
