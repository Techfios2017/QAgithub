package Github.GitHubTrial;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	@Test
	public void userShouldBEalbletoadddeposit() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://techfios.com/test/billing/?ng=login/");
	driver.manage().deleteAllCookies();
	driver.close();
	driver.quit();
	}

}
