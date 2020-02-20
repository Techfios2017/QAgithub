package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidatePostPage extends BasePage {

	WebDriver driver;
	
	public ValidatePostPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//a[@aria-label='“Niraj Shrestha” (Edit)']")WebElement Niraj;

	public void waitForPage() {
		waitForElement(Niraj,driver);
	}
}
