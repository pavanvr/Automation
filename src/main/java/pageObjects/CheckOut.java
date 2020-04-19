package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import resources.Base;
import resources.DataHelper;

public class CheckOut extends Base {

	public static WebDriver driver;

	public CheckOut(WebDriver driver) {

		CheckOut.driver = driver;

	}

	public static final By EMAIL_ADDRESS = By.id("email_create");
	public static final By CREATE_AN_ACCOUNT = By.id("SubmitCreate");
	public static final By TITLE = By.id("id_gender1");
	public static final By FIRST_NAME = By.id("customer_firstname");
	public static final By SECOND_NAME = By.id("customer_lastname");
	public static final By DOB_DATE = By.id("days");
	public static final By DOB_MONTH = By.id("months");
	public static final By DOB_YEARS = By.id("years");
	public static final By ADDRESS = By.id("address1");
	public static final By CITY = By.id("city");
	public static final By STATE = By.id("id_state");
	public static final By POSTAL_CODE = By.id("postcode");
	public static final By MOBILE_PHONE = By.id("phone_mobile");
	public static final By REGISTER_BUTTON = By.xpath("//span[text()='Register']");
	public static final By PROCEED_TO_CHECKOUT = By.xpath("//span[text()='Proceed to checkout']");
	public static final By AGREE_TERMS = By.id("cgv");
	public static final By PAY_BY_CHECK = By.xpath("//a[contains(@title,'Pay by check')]");
	public static final By CONFIRM_ORDER_BUTTON = By.xpath("//span[text()='I confirm my order']");
	public static final By PROCEED_TO_CHECKOUT1 = By.cssSelector("#form > p > button");
	public static final By CONFIRMATION_TEXT = By.xpath("//p[text()='Your order on My Store is complete.']");
	public static final By EMAIL = By.id("email");
	public static final By PASSWORD = By.id("passwd");;
	public static final By SIGNIN = By.xpath("//*[@id='SubmitLogin']/span");
			
	
	public void registerNewUser() throws InterruptedException {

		String text = DataHelper.alphaNumericString(5);
		String email = text+"@mailmaru.com";
		driver.findElement(EMAIL_ADDRESS).sendKeys(email);
		driver.findElement(CREATE_AN_ACCOUNT).click();
		Thread.sleep(2000);
		CreateAccountPage ca = new CreateAccountPage(driver);
		ca.createNewAccount();
	}	
	
	public void existingUserSignin(String email, String password) throws InterruptedException {
		
		driver.findElement(EMAIL).sendKeys(email);
		driver.findElement(PASSWORD).sendKeys(password);
		driver.findElement(SIGNIN).click();
		
	}

	public void proceedToChkout() throws InterruptedException {

		driver.findElement(PROCEED_TO_CHECKOUT).click();
		driver.findElement(AGREE_TERMS).click();
		Thread.sleep(2000);
		driver.findElement(PROCEED_TO_CHECKOUT1).click();
		Thread.sleep(3000);
		driver.findElement(PAY_BY_CHECK).click();
		driver.findElement(CONFIRM_ORDER_BUTTON).click();
	}

	public static String orderConfirmationMsg() {
		String ConfirmationMessage = driver.findElement(CONFIRMATION_TEXT).getText();
		return ConfirmationMessage;
	}

}
