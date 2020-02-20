package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateDraftPage {

	WebDriver driver;
	
	public CreateDraftPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.ID, using = "title") WebElement Title;
	@FindBy (how = How.ID, using ="content") WebElement Content;
	@FindBy (how = How.ID, using ="save-post") WebElement SaveDraft;

	public void CreateDraft() {
		Title.sendKeys("Niraj Shrestha");
		Content.sendKeys("Hello!! My name is Niraj");
		SaveDraft.click();
	}
	
}