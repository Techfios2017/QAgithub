package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import page.QuickDraftPage;
import util.BrowserFactory;

public class DashBoardTest {

	 WebDriver driver;

	@Test
	public void dashBoardTest() {
		// Start Browser //Go to Site
		driver = BrowserFactory.startBrowser();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login();
		// validate the dashboard displayed using explicit wait
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.waitForPage();

		// Validate Text Quick Draft is displayed
		QuickDraftPage quickDraft = PageFactory.initElements(driver, QuickDraftPage.class);
		quickDraft.waitForPage();
		driver.close();
		driver.quit();
	}
}