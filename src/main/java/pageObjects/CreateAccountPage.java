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

	public static final By SIGN_IN = By.xpath("//a[@class='login']");
	public static final By EMAIL_ADDRESS = By.id("email_create");
	public static final By CREATE_AN_ACCOUNT = By.id("SubmitCreate");
	public static final By TITLE = By.id("id_gender1");
	public static final By FIRST_NAME = By.id("customer_firstname");
	public static final By SECOND_NAME = By.id("customer_lastname");
	public static final By PASSWORD = By.id("passwd");
	public static final By DOB_DATE = By.id("days");
	public static final By DOB_MONTH = By.id("months");
	public static final By DOB_YEARS = By.id("years");
	public static final By ADDRESS = By.id("address1");
	public static final By CITY = By.id("city");
	public static final By STATE = By.id("id_state");
	public static final By POSTAL_CODE = By.id("postcode");
	public static final By MOBILE_PHONE = By.id("phone_mobile");
	public static final By REGISTER_BUTTON = By.xpath("//span[text()='Register']");
	public static final By CONFIRMATION_TEXT = By.xpath(
			"//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']");
	//public static final By CONFIRMATION_TEXT = By.xpath("//*[@id='center_column']/p");
	
	public void getCreateAcPage(String email) throws InterruptedException {

		driver.findElement(SIGN_IN).click();
		driver.findElement(EMAIL_ADDRESS).sendKeys(email);
		driver.findElement(CREATE_AN_ACCOUNT).click();
		Thread.sleep(2000);
	}

	public void createNewAccount() throws InterruptedException {

		driver.findElement(TITLE).click();
		driver.findElement(FIRST_NAME).sendKeys("Testname");
		driver.findElement(SECOND_NAME).sendKeys("Testsurname");
		driver.findElement(PASSWORD).sendKeys("Password-1");
		WebElement DOB1 = driver.findElement(DOB_DATE);
		WebElement DOB2 = driver.findElement(DOB_MONTH);
		WebElement DOB3 = driver.findElement(DOB_YEARS);
		Select select1 = new Select(DOB1);
		Select select2 = new Select(DOB2);
		Select select3 = new Select(DOB3);
		select1.selectByValue("1");
		select2.selectByIndex(1);
		select3.selectByIndex(20);
		driver.findElement(ADDRESS).sendKeys("Test Address");
		driver.findElement(CITY).sendKeys("New York");
		WebElement state = driver.findElement(STATE);
		Select state1 = new Select(state);
		state1.selectByIndex(1);
		driver.findElement(POSTAL_CODE).sendKeys("12342");
		driver.findElement(MOBILE_PHONE).sendKeys("23456780");
		driver.findElement(REGISTER_BUTTON).click();
		Thread.sleep(1000);

	}

	
	public static String createAcConfMessage() {
		String ConfirmationMessage = driver.findElement(CONFIRMATION_TEXT).getText();
		System.out.println(ConfirmationMessage);
		return ConfirmationMessage;
	}
}
