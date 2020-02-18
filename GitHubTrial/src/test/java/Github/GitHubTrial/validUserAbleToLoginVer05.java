package Github.GitHubTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

public class validUserAbleToLoginVer05 {

	WebDriver driver;

	public void browserOpen() {
        //Due to verion difference of driver, test may fail.
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
	}

	@Test
	public void validUserAbleToLogin() throws InterruptedException {
 
		browserOpen();
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		String displayDashboardPath = "//h2[contains(text(),'Dashboard')]";
		WebElement waitWebElement = driver.findElement(By.xpath(displayDashboardPath));
		waitForElement(driver, 5, waitWebElement);
		exit();

	}

	public void exit() {
		driver.close();
		driver.quit();

	}

	public static void waitForElement(WebDriver driver, int timeInSec, WebElement waitWebElement) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSec);
		wait.until(ExpectedConditions.visibilityOf(waitWebElement));
	}

}
