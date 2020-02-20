package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CreateDraftPage;
import page.LoginPage;
import page.PostPage;
import page.ValidatePostPage;
import util.BrowserFactory;

public class ValidatePostTest {

	WebDriver driver;
	
	public void validatePostTest() {
		driver = BrowserFactory.startBrowser();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login();
		CreateDraftPage createDraft = PageFactory.initElements(driver, CreateDraftPage.class);
		createDraft.CreateDraft();
		PostPage postPage = PageFactory.initElements(driver, PostPage.class);
		postPage.clickViewAll();
		postPage.waitForPage();
		ValidatePostPage validPost = PageFactory.initElements(driver,ValidatePostPage.class);
		validPost.waitForPage();
		driver.close();
		driver.quit();
	}
}
