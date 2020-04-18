package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import resources.Base;

@Test
public class CreateAccountPage extends Base {

	public static WebDriver driver;

	public CreateAccountPage(WebDriver driver) {

		CreateAccountPage.driver = driver;

	}

	public static final By signIn = By.xpath("//a[@class='login']");
	public static final By EMAIL_ADDRESS_IDENTIFIER = By.id("email_create");
	public static final By CREATE_AN_ACCOUNT_IDENTIFIER = By.id("SubmitCreate");
	public static final By TITLE_IDENTIFIER = By.id("id_gender1");
	public static final By FIRST_NAME_IDENTIFIER = By.id("customer_firstname");
	public static final By SECOND_NAME_IDENTIFIER = By.id("customer_lastname");
	public static final By PASSWORD_IDENTIFIER = By.id("passwd");
	public static final By DOB_DATE_IDENTIFIER = By.id("days");
	public static final By DOB_MONTH_IDENTIFIER = By.id("months");
	public static final By DOB_YEARS_IDENTIFIER = By.id("years");
	public static final By ADDRESS_IDENTIFIER = By.id("address1");
	public static final By CITY_IDENTIFIER = By.id("city");
	public static final By STATE_IDENTIFIER = By.id("id_state");
	public static final By POSTAL_CODE_IDENTIFIER = By.id("postcode");
	public static final By MOBILE_PHONE_IDENTIFIER = By.id("phone_mobile");
	public static final By REGISTER_BUTTON_IDENTIFIER = By.xpath("//span[text()='Register']");
	//public static final By CONFIRMATION_TEXT_IDENTIFIER = By.xpath(
		//	"//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']");
	public static final By CONFIRMATION_TEXT_IDENTIFIER = By.xpath("//*[@id='center_column']/p");
	
	public void getCreateAcPage(String email) throws InterruptedException {

		driver.findElement(signIn).click();
		driver.findElement(EMAIL_ADDRESS_IDENTIFIER).sendKeys(email);
		driver.findElement(CREATE_AN_ACCOUNT_IDENTIFIER).click();
		Thread.sleep(2000);
	}

	public void createNewAccount() throws InterruptedException {

		driver.findElement(TITLE_IDENTIFIER).click();
		driver.findElement(FIRST_NAME_IDENTIFIER).sendKeys("Testname");
		driver.findElement(SECOND_NAME_IDENTIFIER).sendKeys("Testsurname");
		driver.findElement(PASSWORD_IDENTIFIER).sendKeys("Password-1");
		WebElement DOB1 = driver.findElement(DOB_DATE_IDENTIFIER);
		WebElement DOB2 = driver.findElement(DOB_MONTH_IDENTIFIER);
		WebElement DOB3 = driver.findElement(DOB_YEARS_IDENTIFIER);
		Select select1 = new Select(DOB1);
		Select select2 = new Select(DOB2);
		Select select3 = new Select(DOB3);
		select1.selectByValue("1");
		select2.selectByIndex(1);
		select3.selectByIndex(20);
		driver.findElement(ADDRESS_IDENTIFIER).sendKeys("Test Address");
		driver.findElement(CITY_IDENTIFIER).sendKeys("New York");
		WebElement state = driver.findElement(STATE_IDENTIFIER);
		Select state1 = new Select(state);
		state1.selectByIndex(1);
		driver.findElement(POSTAL_CODE_IDENTIFIER).sendKeys("12342");
		driver.findElement(MOBILE_PHONE_IDENTIFIER).sendKeys("23456780");
		driver.findElement(REGISTER_BUTTON_IDENTIFIER).click();
		Thread.sleep(1000);

	}

	
	public static String createAcConfMessage() {
		String ConfirmationMessage = driver.findElement(CONFIRMATION_TEXT_IDENTIFIER).getText();
		System.out.println(ConfirmationMessage);
		return ConfirmationMessage;
	}
}
