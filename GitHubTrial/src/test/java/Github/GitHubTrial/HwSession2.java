package Github.GitHubTrial;


import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class HwSession2 {
	@Test
	
	public void DepositAndVerify() throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng");
	
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
	
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-xs']")).click();
		driver.findElement(By.xpath("//option[@value='housedownpayment']")).click();

       driver.findElement(By.xpath("//input[@name='description']")).sendKeys("personal");
       Thread.sleep(3000);
        
       driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("10000");
    
       driver.findElement(By.xpath("//button[@id='submit'] ")).click();
       Thread.sleep(3000);
      String depositValidater="//input[@value='personal']";
       WebDriverWait  wait= new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(depositValidater)));
       
       
       
       
       Thread.sleep(3000);
     
       
        
		driver.close();
		driver.quit();
		
		
		
		
		
		
		

		
		
	
		
	}

}
