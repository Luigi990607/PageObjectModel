package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.Test;

import utils.BaseTest;

public class EditAdressShippingTest extends BaseTest{

	@Test
	public void testShipping() throws InterruptedException {
		app.click(app.menu.loginLink);
		app.login.loginInApp("TestUser", "12345@67890");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(app.login.logoutButton));
		driver.get("https://keybooks.ro/account/edit-address/shipping/");
		app.shippingpage.selectByIndex(41, app.shippingpage.countryDropdown);
		app.shippingpage.selectByValue("NL", app.shippingpage.provinceSelector);
		
		assertEquals(app.shippingpage.getSelectedOption(app.shippingpage.countryDropdown), "Canada");
		assertEquals(app.shippingpage.getSelectedOption(app.shippingpage.provinceDropdown), "Newfoundland and Labrador");
	}
}
