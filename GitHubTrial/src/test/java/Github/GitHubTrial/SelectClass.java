package Github.GitHubTrial;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClass {
	WebDriver driver;

	@BeforeMethod
	public void startBrowser() {
	System.setProperty("webdriver.chrome.driver", "./Chrome/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://objectspy.space/");
	}
	@Test
	public void selectTest() throws InterruptedException {
	//Select South America
	Select select = new Select(driver.findElement(By.id("continents")));
	//select.selectByIndex(4);
	select.selectByValue("Antartica");
	Thread.sleep(10000);
	}
	@AfterMethod
	public void close() {
	driver.close();
	driver.quit();
	}

}
