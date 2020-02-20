package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.CreateDraftPage;
import page.LoginPage;
import page.PostPage;
import util.BrowserFactory;

public class PostTest {

	 WebDriver driver;
	
	@Test
	public void postTest() {
	driver = BrowserFactory.startBrowser();
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.login();
	CreateDraftPage createDraft = PageFactory.initElements(driver, CreateDraftPage.class);
	createDraft.CreateDraft();
	PostPage postPage = PageFactory.initElements(driver, PostPage.class);
	postPage.clickViewAll();
	postPage.waitForPage();
	driver.close();
	driver.quit();
	}
}
