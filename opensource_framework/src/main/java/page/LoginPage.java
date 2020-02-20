package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//Element Library//set some Elements
	//By userName = By.id ("username");
	//WebElement userName = driver.findElement(By.id("username"));
	@FindBy(how = How.ID, using = "user_login")WebElement Username;
	@FindBy(how = How.ID, using = "user_pass")WebElement Password;
	@FindBy(how = How.ID, using = "wp-submit")WebElement Submit;

	//Methods to interact with Elements
	public void login() {
		Username.sendKeys("opensourcecms");
		Password.sendKeys("opensourcecms");
		Submit.click();
		
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	

	

	
	

}
