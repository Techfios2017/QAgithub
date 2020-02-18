package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	static WebDriver driver;
	
	@Test
	public void userShouldBeAbleToLogIn() {
		//Start Browser
		driver = BrowserFactory.startBrowser(); 
		//Go to Site
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		//Call Log in Method from Log in page
		//LoginPage loginPage = new LoginPage(driver);
		//Doesn't work Use below method instead
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("opensourcecms","opensourcecms");
		
	}

}
