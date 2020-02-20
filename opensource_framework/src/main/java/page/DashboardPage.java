package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver =driver; //Constructor to invite the driver
	}
	//Element Library
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Dashboard')]") WebElement Dashboard;

	public void waitForPage() {
		waitForElement(Dashboard,driver);
	}


}

