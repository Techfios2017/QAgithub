package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuickDraftPage extends BasePage {

	 WebDriver driver;
	
	public QuickDraftPage(WebDriver driver) {
		this.driver = driver;
	}
		@FindBy(how = How.XPATH, using = "//h2[@class='hndle ui-sortable-handle']//descendant::span[text()='Quick Draft']")
		WebElement QuickDraft;

		public void waitForPage() {
		waitForElement(QuickDraft, driver);
		}
	}
		

