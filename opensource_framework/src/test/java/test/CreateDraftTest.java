package test;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CreateDraftPage;
import page.LoginPage;
import util.BrowserFactory;

public class CreateDraftTest {

	WebDriver driver;

	@Test
	public void userShouldBeAbleToCreateAQuickDraft() throws InterruptedException {
		driver = BrowserFactory.startBrowser();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login();
		CreateDraftPage CreateDraft = PageFactory.initElements(driver, CreateDraftPage.class);
		CreateDraft.CreateDraft();
		driver.close();
		driver.quit();
	}
}
