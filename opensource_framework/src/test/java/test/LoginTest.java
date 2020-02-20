package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test
	public void userShouldBeAbleToLogIn() {
		// Start Browser
		driver = BrowserFactory.startBrowser();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		String expectedTitle = "Log In ‹ opensourcecms — WordPress";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Not Found!!");

		loginPage.login();

	driver.close();
	driver.quit();
	}

}