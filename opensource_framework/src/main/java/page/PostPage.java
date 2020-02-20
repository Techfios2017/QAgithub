package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostPage extends BasePage {
	WebDriver driver;

	public PostPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//p[@class='view-all']")
	WebElement ViewAllDrafts;
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Posts')]")
	WebElement Post;

	public void clickViewAll() {
		ViewAllDrafts.click();
	}
	public void waitForPage() {
	waitForElement(Post,driver);
	}

}