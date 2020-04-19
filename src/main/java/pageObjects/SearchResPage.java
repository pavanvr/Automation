package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Base;

public class SearchResPage extends Base {

	public static WebDriver driver;

	public SearchResPage(WebDriver driver) {

		SearchResPage.driver = driver;
	}

	public static final By RES_TEXT = By.xpath("//*[@id=\"center_column\"]/h1/span[2]");

	public SearchProducts getSearchRes() throws InterruptedException {

		driver.findElement(RES_TEXT);
		Thread.sleep(1000);
		return new SearchProducts(driver);

	}

}
